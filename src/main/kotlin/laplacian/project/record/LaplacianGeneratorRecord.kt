package laplacian.project.record
import com.github.jknack.handlebars.Context
import laplacian.gradle.task.generate.model.Project
import laplacian.project.model.LaplacianGenerator
import laplacian.project.model.LaplacianGeneratorList
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
    private val _record: Record = __record.normalizeCamelcase()
): LaplacianGenerator, Record by _record {


    /**
     * The name of this laplacian_generator.
     */
    override val name: String
        get() = getOrThrow("name")

    /**
     * The group of this laplacian_generator.
     */
    override val group: String
        get() = getOrThrow("group")

    /**
     * The version of this laplacian_generator.
     */
    override val version: String
        get() = getOrThrow("version")

    /**
     * The description of this laplacian_generator.
     */
    override val description: String
        get() = getOrThrow("description") {
            "A generator which creates ${name.pluralize()}"
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
        fun from(_context: Context): LaplacianGeneratorList {
            return _context.get("laplacian_generators") as LaplacianGeneratorList
        }
    }
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LaplacianGeneratorRecord) return false
        if (name != other.name) return false
        if (group != other.group) return false
        if (version != other.version) return false
        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + group.hashCode()
        result = 31 * result + version.hashCode()
        return result
    }

    override fun toString(): String {
        return "LaplacianGeneratorRecord(" +
            "name=$name, " +
            "group=$group, " +
            "version=$version" +
        ")"
    }
}