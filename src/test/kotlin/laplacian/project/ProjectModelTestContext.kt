package laplacian.project

import laplacian.gradle.task.generate.ExecutionContext
import laplacian.gradle.task.generate.ProjectEntryResolver
import laplacian.project.gradle.ProjectModelEntryResolver
import laplacian.project.model.LaplacianModuleList
import laplacian.project.model.LaplacianGeneratorList
import laplacian.project.model.LaplacianProjectList
import laplacian.project.model.LaplacianModuleDependencyList
import java.io.File

class ProjectModelTestContext {
    val laplacianModules: LaplacianModuleList
        get() = executionContext.currentModel["laplacian_modules"] as LaplacianModuleList
    val laplacianGenerators: LaplacianGeneratorList
        get() = executionContext.currentModel["laplacian_generators"] as LaplacianGeneratorList
    val laplacianProjects: LaplacianProjectList
        get() = executionContext.currentModel["laplacian_projects"] as LaplacianProjectList
    val laplacianModuleDependencies: LaplacianModuleDependencyList
        get() = executionContext.currentModel["laplacian_module_dependencies"] as LaplacianModuleDependencyList
    var executionContext: ExecutionContext = ExecutionContext().also { context ->
        val projectModel = File("laplacian-module.yml")
        if (projectModel.exists()) context.addModel(projectModel)
        context.addModelEntryResolver(
            ProjectModelEntryResolver()
        )
    }

    fun models(vararg models: String): ProjectModelTestContext {
        executionContext.addModel(*models).build()
        return this
    }
}