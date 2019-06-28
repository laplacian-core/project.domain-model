package laplacian.project.model


import laplacian.util.*

/**
 * laplacian_plugin_dependency
 */
interface LaplacianPluginDependency : LaplacianModuleDependency {
    /**
     * generator
     */
    val generator: LaplacianGenerator
}