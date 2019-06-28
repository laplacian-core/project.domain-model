package laplacian.project.model


import laplacian.util.*

/**
 * laplacian_template_dependency
 */
interface LaplacianTemplateDependency : LaplacianModuleDependency {
    /**
     * generator
     */
    val generator: LaplacianGenerator
}