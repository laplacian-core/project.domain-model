package laplacian.project.model


import laplacian.util.*

/**
 * laplacian_generator
 */
interface LaplacianGenerator {
    /**
     * The name of this laplacian_generator.
     */
    val name: String
    /**
     * project
     */
    val project: LaplacianProject
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