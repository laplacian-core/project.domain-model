package laplacian.project.record
import com.github.jknack.handlebars.Context
import laplacian.gradle.task.generate.model.Project
import laplacian.project.model.LaplacianModelDependency
import laplacian.project.model.LaplacianProject
import laplacian.util.*
/**
 * laplacian_model_dependency
 */
data class LaplacianModelDependencyRecord (
    private val __record: Record,
    private val _context: Context,
    override val dependedBy: LaplacianProject,
    private val _record: Record = __record.normalizeCamelcase()
): LaplacianModuleDependencyRecord(__record, _context), LaplacianModelDependency, Record by _record {
    /**
     * The laplacian module project definition.
     */
    private val project: Project
        get() = _context.get("project") as Project


    /**
     * The type of this laplacian_model_dependency.
     */
    override val type: String
        get() = "model"

    companion object {
        /**
         * creates record list from list of map
         */
        fun from(records: RecordList, _context: Context, dependedBy: LaplacianProject) = records
            .map {
                LaplacianModelDependencyRecord(it, _context, dependedBy = dependedBy)
            }
    }
}