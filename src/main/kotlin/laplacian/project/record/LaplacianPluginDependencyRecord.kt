package laplacian.project.record
import com.github.jknack.handlebars.Context
import laplacian.gradle.task.generate.model.Project
import laplacian.project.model.LaplacianPluginDependency
import laplacian.project.model.LaplacianProject
import laplacian.util.*
/**
 * laplacian_plugin_dependency
 */
data class LaplacianPluginDependencyRecord (
    private val __record: Record,
    private val _context: Context,
    override val dependedBy: LaplacianProject,
    private val _record: Record = __record.normalizeCamelcase()
): LaplacianModuleDependencyRecord(__record, _context), LaplacianPluginDependency, Record by _record {
    /**
     * The laplacian module project definition.
     */
    private val project: Project
        get() = _context.get("project") as Project


    /**
     * The type of this laplacian_plugin_dependency.
     */
    override val type: String
        get() = "plugin"

    companion object {
        /**
         * creates record list from list of map
         */
        fun from(records: RecordList, _context: Context, dependedBy: LaplacianProject) = records
            .map {
                LaplacianPluginDependencyRecord(it, _context, dependedBy = dependedBy)
            }
    }
}