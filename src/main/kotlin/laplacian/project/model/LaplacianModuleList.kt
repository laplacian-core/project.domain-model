package laplacian.project.model
import com.github.jknack.handlebars.Context

import laplacian.util.*

/**
 * A container for records of laplacian_module
 */
class LaplacianModuleList(
    list: List<LaplacianModule>,
    val context: Context
) : List<LaplacianModule> by list {
}