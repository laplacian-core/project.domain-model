package laplacian.project.model
import com.github.jknack.handlebars.Context

import laplacian.util.*

/**
 * A container for records of laplacian_project
 */
class LaplacianProjectList(
    list: List<LaplacianProject>,
    val context: Context
) : List<LaplacianProject> by list {
    val inNamespace: List<LaplacianProject>
        get() = filter {
            it.namespace.startsWith(context.get("project.namespace") as String)
        }
}