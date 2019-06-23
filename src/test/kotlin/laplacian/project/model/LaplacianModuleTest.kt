package laplacian.project.model

import laplacian.project.ProjectModelTestContext
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

class LaplacianModuleTest {

    companion object {
        val MODEL_YAML = """
        |laplacian_modules:
        |
        |- group: laplacian
        |  type: model
        |  name: metamodel
        |  version: 1.0.0
        |  repository: https://github.com/nabla-squared/laplacian.model.metamodel
        |  models:
        |  - group: laplacian
        |    name: metamodel
        |    version: 1.0.0
        |  templates:
        |  - group: laplacian
        |    name: entity
        |    subname: kotlin
        |    version: 1.0.0
        """.trimMargin()
    }

    val laplacian_modules: LaplacianModuleList
        get() = ProjectModelTestContext().models(MODEL_YAML).laplacianModules


    @Test
    fun `each properties of a laplacian_module model returns the appropriate value`() {
        val model = laplacian_modules.find {
                it.name == "metamodel" &&
                it.group == "laplacian" &&
                it.subname == null
            }!!
            as LaplacianModule

        assertAll(
            { assertEquals("metamodel", model.name) },
            { assertEquals("laplacian", model.group) },
            { assertEquals("model", model.type) },
            { assertEquals("1.0.0", model.version) },
            { assertEquals("LAPLACIAN/METAMODEL - a laplacian model project", model.description) },
            { assertEquals(listOf("laplacian", "model", "metamodel"), model.moduleSignature) },
            { assertEquals("laplacian.model.metamodel", model.moduleId) },
            { assertEquals("laplacian:laplacian.model.metamodel:1.0.0", model.artifactId) },
            { assertEquals(false, model.forTemplate) },
            { assertEquals(true, model.forModel) },
            { assertEquals(false, model.forPlugin) },
            { assertEquals(false, model.forGenerator) }
        )
    }

}