package laplacian.project.model


import laplacian.util.*

/**
 * laplacian_model_dependency
 */
interface LaplacianModelDependency : LaplacianModuleDependency {
    /**
     * generator
     */
    val generator: LaplacianGenerator
}