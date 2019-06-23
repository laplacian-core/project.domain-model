package laplacian.project.model


import laplacian.util.*

/**
 * laplacian_module_dependency
 */
interface LaplacianModuleDependency {
    /**
     * The group of this laplacian_module_dependency.
     */
    val group: String
    /**
     * The name of this laplacian_module_dependency.
     */
    val name: String
    /**
     * The subname of this laplacian_module_dependency.
     */
    val subname: String?
    /**
     * The version of this laplacian_module_dependency.
     */
    val version: String
    /**
     * The type of this laplacian_module_dependency.
     */
    val type: String
    /**
     * depends_to
     */
    val dependsTo: LaplacianModule
}