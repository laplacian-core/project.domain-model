package laplacian.project.record
import com.github.jknack.handlebars.Context
import laplacian.gradle.task.generate.model.Project
import laplacian.project.model.LaplacianTemplateDependency
import laplacian.project.model.LaplacianProject
import laplacian.util.*
/**
 * laplacian_template_dependency
 */
data class LaplacianTemplateDependencyRecord (
    private val __record: Record,
    private val _context: Context,
    override val dependedBy: LaplacianProject,
    private val _record: Record = __record.normalizeCamelcase()
): LaplacianModuleDependencyRecord(__record, _context), LaplacianTemplateDependency, Record by _record {
    /**
     * The laplacian module project definition.
     */
    private val project: Project
        get() = _context.get("project") as Project


    /**
     * The type of this laplacian_template_dependency.
     */
    override val type: String
        get() = "template"

    companion object {
        /**
         * creates record list from list of map
         */
        fun from(records: RecordList, _context: Context, dependedBy: LaplacianProject) = records
            .map {
                LaplacianTemplateDependencyRecord(it, _context, dependedBy = dependedBy)
            }
    }
}