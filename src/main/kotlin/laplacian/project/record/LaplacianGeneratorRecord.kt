package laplacian.project.record
import com.github.jknack.handlebars.Context
import laplacian.gradle.task.generate.model.Project
import laplacian.project.model.LaplacianGenerator
import laplacian.project.model.LaplacianProject
import laplacian.project.model.LaplacianPluginDependency
import laplacian.project.model.LaplacianModelDependency
import laplacian.project.model.LaplacianTemplateDependency
import laplacian.util.*
/**
 * laplacian_generator
 */
data class LaplacianGeneratorRecord (
    private val __record: Record,
    private val _context: Context,
    override val project: LaplacianProject,
    private val _record: Record = __record.normalizeCamelcase()
): LaplacianGenerator, Record by _record {


    /**
     * The name of this laplacian_generator.
     */
    override val name: String
        get() = getOrThrow("name")

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
        fun from(records: RecordList, _context: Context, project: LaplacianProject) = records
            .mergeWithKeys("name")
            .map {
                LaplacianGeneratorRecord(it, _context, project = project)
            }
    }
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LaplacianGeneratorRecord) return false
        if (project != other.project) return false
        if (name != other.name) return false
        return true
    }

    override fun hashCode(): Int {
        var result = project.hashCode()
        result = 31 * result + name.hashCode()
        return result
    }

    override fun toString(): String {
        return "LaplacianGeneratorRecord(" +
            "project=$project, " +
            "name=$name" +
        ")"
    }
}