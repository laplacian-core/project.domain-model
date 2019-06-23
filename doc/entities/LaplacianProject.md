# **LaplacianProject**
**namespace:** laplacian.project

laplacian_project



---

## Properties

### namespace: `String`
The namespace of this laplacian_project.
- **Default Value:**
  ```kotlin
  listOfNotNull(group, name, subname)
      .map{ it.lowerUnderscorize() }
      .joinToString(".")
  ```

## Relationships

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