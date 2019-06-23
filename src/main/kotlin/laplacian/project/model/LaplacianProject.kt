package laplacian.project.model


import laplacian.util.*

/**
 * laplacian_project
 */
interface LaplacianProject : LaplacianModule {
    /**
     * The namespace of this laplacian_project.
     */
    val namespace: String
    /**
     * plugins
     */
    val plugins: List<LaplacianPluginDependency>
    /**
     * plugins_excluding_self
     */
    val pluginsExcludingSelf: List<LaplacianPluginDependency>
        get() = plugins.filter{ it != this }
    /**
     * models
     */
    val models: List<LaplacianModelDependency>
    /**
     * models_excluding_self
     */
    val modelsExcludingSelf: List<LaplacianModelDependency>
        get() = models.filter{ it != this }
    /**
     * templates
     */
    val templates: List<LaplacianTemplateDependency>
    /**
     * templates_excluding_self
     */
    val templatesExcludingSelf: List<LaplacianTemplateDependency>
        get() = templates.filter{ it != this }
}