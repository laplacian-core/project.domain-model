package laplacian.project.model


import laplacian.util.*

/**
 * laplacian_model_dependency
 */
interface LaplacianModelDependency : LaplacianModuleDependency {
    /**
     * depended_by
     */
    val dependedBy: LaplacianProject
}