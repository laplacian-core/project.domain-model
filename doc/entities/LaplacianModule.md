# **LaplacianModule**
**namespace:** laplacian.project

laplacian_module


example1:
```yaml
group: laplacian
  type: model
  name: metamodel
  version: 1.0.0
  repository: https://github.com/nabla-squared/laplacian.model.metamodel
  models:
  - group: laplacian
    name: metamodel
    version: 1.0.0
  templates:
  - group: laplacian
    name: entity
    subname: kotlin
    version: 1.0.0
```


---

## Properties

### name: `String`
The name of this laplacian_module.
- **Attributes:** *PK*

### group: `String`
The group of this laplacian_module.
- **Attributes:** *PK*

### type: `String`
The type of this laplacian_module.
- **Default Value:**
  ```kotlin
  "generator"
  ```

### subname: `String`
The subname of this laplacian_module.
- **Attributes:** *PK*

### version: `String`
The version of this laplacian_module.

### description: `String`
The description of this laplacian_module.
- **Default Value:**
  ```kotlin
  "${group.toUpperCase()}/${name.toUpperCase()} - a laplacian $type project"
  ```

### repository: `String`
The url of the code repository this project is hosted


### module_signature: `List<String>`
The module_signature of this laplacian_module.
- **Code:**
  ```kotlin
  listOfNotNull(group, type, name, subname)
  ```

### module_id: `String`
The module_id of this laplacian_module.
- **Code:**
  ```kotlin
  moduleSignature.map(String::lowerHyphenize).joinToString(".")
  ```

### artifact_id: `String`
The artifact_id of this laplacian_module.
- **Code:**
  ```kotlin
  "$group:$moduleId:$version"
  ```

### for_template: `Boolean`
Defines this laplacian_module is for_template or not.
- **Code:**
  ```kotlin
  type == "template"
  ```

### for_model: `Boolean`
Defines this laplacian_module is for_model or not.
- **Code:**
  ```kotlin
  type == "model"
  ```

### for_plugin: `Boolean`
Defines this laplacian_module is for_plugin or not.
- **Code:**
  ```kotlin
  type == "plugin"
  ```

### for_generator: `Boolean`
Defines this laplacian_module is for_generator or not.
- **Code:**
  ```kotlin
  type == "generator"
  ```

## Relationships