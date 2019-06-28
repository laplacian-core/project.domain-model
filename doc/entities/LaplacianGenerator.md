# **LaplacianGenerator**
**namespace:** laplacian.project

laplacian_generator



---

## Properties

### name: `String`
The name of this laplacian_generator.
- **Attributes:** *PK*

## Relationships

### project: `LaplacianProject`
project
- **Cardinality:** `1`

### plugins: `List<LaplacianPluginDependency>`
plugins
- **Cardinality:** `*`

### plugins_excluding_self: `List<LaplacianPluginDependency>`
plugins_excluding_self
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  plugins.filter{ it != this }
  ```

### models: `List<LaplacianModelDependency>`
models
- **Cardinality:** `*`

### models_excluding_self: `List<LaplacianModelDependency>`
models_excluding_self
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  models.filter{ it != this }
  ```

### templates: `List<LaplacianTemplateDependency>`
templates
- **Cardinality:** `*`

### templates_excluding_self: `List<LaplacianTemplateDependency>`
templates_excluding_self
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  templates.filter{ it != this }
  ```