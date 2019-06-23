package laplacian.project.model


import laplacian.util.*

/**
 * laplacian_module
 */
interface LaplacianModule {
    /**
     * The name of this laplacian_module.
     */
    val name: String
    /**
     * The group of this laplacian_module.
     */
    val group: String
    /**
     * The type of this laplacian_module.
     */
    val type: String
    /**
     * The subname of this laplacian_module.
     */
    val subname: String?
    /**
     * The version of this laplacian_module.
     */
    val version: String
    /**
     * The description of this laplacian_module.
     */
    val description: String
    /**
     * The url of the code repository this project is hosted

     */
    val repository: String?
    /**
     * The module_signature of this laplacian_module.
     */
    val moduleSignature: List<String>
    /**
     * The module_id of this laplacian_module.
     */
    val moduleId: String
    /**
     * The artifact_id of this laplacian_module.
     */
    val artifactId: String
    /**
     * Defines this laplacian_module is for_template or not.
     */
    val forTemplate: Boolean
    /**
     * Defines this laplacian_module is for_model or not.
     */
    val forModel: Boolean
    /**
     * Defines this laplacian_module is for_plugin or not.
     */
    val forPlugin: Boolean
    /**
     * Defines this laplacian_module is for_generator or not.
     */
    val forGenerator: Boolean
}