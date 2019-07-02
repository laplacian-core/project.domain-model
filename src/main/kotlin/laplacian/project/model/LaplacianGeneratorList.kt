package laplacian.project.model
import com.github.jknack.handlebars.Context

import laplacian.util.*

/**
 * A container for records of laplacian_generator
 */
class LaplacianGeneratorList(
    list: List<LaplacianGenerator>,
    val context: Context
) : List<LaplacianGenerator> by list {
}