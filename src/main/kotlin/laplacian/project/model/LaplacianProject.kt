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
     * generators
     */
    val generators: List<LaplacianGenerator>
}