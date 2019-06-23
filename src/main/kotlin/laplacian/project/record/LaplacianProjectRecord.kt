package laplacian.project.record
import com.github.jknack.handlebars.Context
import laplacian.gradle.task.generate.model.Project
import laplacian.project.model.LaplacianProject
import laplacian.project.model.LaplacianProjectList
import laplacian.project.model.LaplacianPluginDependency
import laplacian.project.model.LaplacianModelDependency
import laplacian.project.model.LaplacianTemplateDependency
import laplacian.util.*
/**
 * laplacian_project
 */
data class LaplacianProjectRecord (
    private val __record: Record,
    private val _context: Context,
    private val _record: Record = __record.normalizeCamelcase()
): LaplacianModuleRecord(__record, _context), LaplacianProject, Record by _record {
    /**
     * The laplacian module project definition.
     */
    private val project: Project
        get() = _context.get("project") as Project


    /**
     * The namespace of this laplacian_project.
     */
    override val namespace: String
        get() = getOrThrow("namespace") {
            listOfNotNull(group, name, subname)
                .map{ it.lowerUnderscorize() }
                .joinToString(".")
        }

    /**
     * plugins
     */
    override val plugins: List<LaplacianPluginDependency>
        = LaplacianPluginDependencyRecord.from(_record.getList("plugins", emptyList()), _context, this)

    /**
     * models
     */
    override val models: List<LaplacianModelDependency>
        = LaplacianModelDependencyRecord.from(_record.getList("models", emptyList()), _context, this)

    /**
     * templates
     */
    override val templates: List<LaplacianTemplateDependency>
        = LaplacianTemplateDependencyRecord.from(_record.getList("templates", emptyList()), _context, this)

    companion object {
        /**
         * creates record list from list of map
         */
        fun from(_context: Context): LaplacianProjectList {
            return _context.get("laplacian_projects") as LaplacianProjectList
        }
    }
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LaplacianProjectRecord) return false
        if (name != other.name) return false
        if (group != other.group) return false
        if (subname != other.subname) return false
        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + group.hashCode()
        result = 31 * result + subname.hashCode()
        return result
    }

    override fun toString(): String {
        return "LaplacianProjectRecord(" +
            "name=$name, " +
            "group=$group, " +
            "subname=$subname" +
        ")"
    }
}