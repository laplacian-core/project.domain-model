package laplacian.project.record
import com.github.jknack.handlebars.Context
import laplacian.gradle.task.generate.model.Project
import laplacian.project.model.LaplacianModuleDependency
import laplacian.project.model.LaplacianModuleDependencyList
import laplacian.project.model.LaplacianModule
import laplacian.util.*
/**
 * laplacian_module_dependency
 */
open class LaplacianModuleDependencyRecord (
    private val __record: Record,
    private val _context: Context,
    private val _record: Record = __record.normalizeCamelcase()
): LaplacianModuleDependency, Record by _record {
    /**
     * The laplacian module project definition.
     */
    private val project: Project
        get() = _context.get("project") as Project


    /**
     * The group of this laplacian_module_dependency.
     */
    override val group: String
        get() = getOrThrow("group")

    /**
     * The name of this laplacian_module_dependency.
     */
    override val name: String
        get() = getOrThrow("name")

    /**
     * The subname of this laplacian_module_dependency.
     */
    override val subname: String? by _record

    /**
     * The version of this laplacian_module_dependency.
     */
    override val version: String
        get() = getOrThrow("version")

    /**
     * The type of this laplacian_module_dependency.
     */
    override val type: String
        get() = getOrThrow("type")

    /**
     * depends_to
     */
    override val dependsTo: LaplacianModule
        get() = LaplacianModuleRecord.from(_context).find {
            it.name == name &&
            it.group == group &&
            it.subname == subname
        } ?: throw IllegalStateException(
            "There is no laplacian_module which meets the following condition(s): "
            + "LaplacianModuleDependency.name == laplacian_module.name (=$name) "
            + "LaplacianModuleDependency.group == laplacian_module.group (=$group) "
            + "LaplacianModuleDependency.subname == laplacian_module.subname (=$subname) "
            + "Possible values are: " + LaplacianModuleRecord.from(_context).map {
              "(${ it.name },${ it.group },${ it.subname })"
            }.joinToString()
        )

    companion object {
        /**
         * creates record list from list of map
         */
        fun from(_context: Context): LaplacianModuleDependencyList {
            return _context.get("laplacian_module_dependencies") as LaplacianModuleDependencyList
        }
    }
}