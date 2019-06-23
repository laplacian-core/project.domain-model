package laplacian.project.gradle
import laplacian.gradle.task.generate.ExecutionContext
import laplacian.gradle.task.generate.ModelEntryResolver
import laplacian.project.model.LaplacianModuleList
import laplacian.project.record.LaplacianModuleRecord
import laplacian.project.model.LaplacianProjectList
import laplacian.project.record.LaplacianProjectRecord
import laplacian.project.model.LaplacianModuleDependencyList
import laplacian.project.record.LaplacianModuleDependencyRecord
import laplacian.util.*

class ProjectModelEntryResolver: ModelEntryResolver {

    override fun resolves(key: String, model: Map<String, RecordList>): Boolean {
        return arrayOf(
            "laplacian_modules",
            "laplacian_projects",
            "laplacian_module_dependencies"
        ).any { it == key }
    }

    override fun resolve(key: String, model: Map<String, RecordList>, context: ExecutionContext): Any? {
        return when (key) {
            "laplacian_modules" -> LaplacianModuleList(
                model.getList<Record>("laplacian_modules")
                     .mergeWithKeys("name", "group", "subname")
                     .map{ LaplacianModuleRecord(it, context.currentModel) },
                context.currentModel
            )
            "laplacian_projects" -> LaplacianProjectList(
                model.getList<Record>("laplacian_projects")
                     .mergeWithKeys("name", "group", "subname")
                     .map{ LaplacianProjectRecord(it, context.currentModel) },
                context.currentModel
            )
            "laplacian_module_dependencies" -> LaplacianModuleDependencyList(
                model.getList<Record>("laplacian_module_dependencies")
                     .mergeWithKeys()
                     .map{ LaplacianModuleDependencyRecord(it, context.currentModel) },
                context.currentModel
            )
            else -> throw IllegalArgumentException("Unknown key: $key")
        }
    }
}