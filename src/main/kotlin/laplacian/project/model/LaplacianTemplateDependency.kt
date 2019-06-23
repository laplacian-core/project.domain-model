package laplacian.project.model


import laplacian.util.*

/**
 * laplacian_template_dependency
 */
interface LaplacianTemplateDependency : LaplacianModuleDependency {
    /**
     * depended_by
     */
    val dependedBy: LaplacianProject
}