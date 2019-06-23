package laplacian.project.model
import com.github.jknack.handlebars.Context

import laplacian.util.*

/**
 * A container for records of laplacian_module_dependency
 */
class LaplacianModuleDependencyList(
    list: List<LaplacianModuleDependency>,
    val context: Context
) : List<LaplacianModuleDependency> by list {
}