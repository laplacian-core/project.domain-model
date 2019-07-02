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
     * parent_project
     */
    val parentProject: LaplacianProject?
    /**
     * subprojects
     */
    val subprojects: List<LaplacianProject>
    /**
     * generators
     */
    val generators: List<LaplacianGenerator>
}