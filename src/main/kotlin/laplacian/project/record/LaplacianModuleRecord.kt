package laplacian.project.record
import com.github.jknack.handlebars.Context
import laplacian.gradle.task.generate.model.Project
import laplacian.project.model.LaplacianModule
import laplacian.project.model.LaplacianModuleList
import laplacian.util.*
/**
 * laplacian_module
 */
open class LaplacianModuleRecord (
    private val __record: Record,
    private val _context: Context,
    private val _record: Record = __record.normalizeCamelcase()
): LaplacianModule, Record by _record {
    /**
     * The laplacian module project definition.
     */
    private val project: Project
        get() = _context.get("project") as Project


    /**
     * The name of this laplacian_module.
     */
    override val name: String
        get() = getOrThrow("name")

    /**
     * The group of this laplacian_module.
     */
    override val group: String
        get() = getOrThrow("group")

    /**
     * The type of this laplacian_module.
     */
    override val type: String
        get() = getOrThrow("type") {
            "generator"
        }

    /**
     * The subname of this laplacian_module.
     */
    override val subname: String? by _record

    /**
     * The version of this laplacian_module.
     */
    override val version: String
        get() = getOrThrow("version")

    /**
     * The description of this laplacian_module.
     */
    override val description: String
        get() = getOrThrow("description") {
            "${group.toUpperCase()}/${name.toUpperCase()} - a laplacian $type project"
        }

    /**
     * The url of the code repository this project is hosted

     */
    override val repository: String? by _record

    /**
     * The module_signature of this laplacian_module.
     */
    override val moduleSignature: List<String>
        get() = listOfNotNull(group, type, name, subname)

    /**
     * The module_id of this laplacian_module.
     */
    override val moduleId: String
        get() = moduleSignature.map(String::lowerHyphenize).joinToString(".")

    /**
     * The artifact_id of this laplacian_module.
     */
    override val artifactId: String
        get() = "$group:$moduleId:$version"

    /**
     * Defines this laplacian_module is for_template or not.
     */
    override val forTemplate: Boolean
        get() = type == "template"

    /**
     * Defines this laplacian_module is for_model or not.
     */
    override val forModel: Boolean
        get() = type == "model"

    /**
     * Defines this laplacian_module is for_plugin or not.
     */
    override val forPlugin: Boolean
        get() = type == "plugin"

    /**
     * Defines this laplacian_module is for_generator or not.
     */
    override val forGenerator: Boolean
        get() = type == "generator"

    companion object {
        /**
         * creates record list from list of map
         */
        fun from(_context: Context): LaplacianModuleList {
            return _context.get("laplacian_modules") as LaplacianModuleList
        }
    }
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LaplacianModuleRecord) return false
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
        return "LaplacianModuleRecord(" +
            "name=$name, " +
            "group=$group, " +
            "subname=$subname" +
        ")"
    }
}