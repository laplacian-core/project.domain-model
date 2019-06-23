package laplacian.project.model


import laplacian.util.*

/**
 * laplacian_plugin_dependency
 */
interface LaplacianPluginDependency : LaplacianModuleDependency {
    /**
     * depended_by
     */
    val dependedBy: LaplacianProject
}