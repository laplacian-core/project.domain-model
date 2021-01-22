# **Project**
**namespace:** laplacian.project

An entity describing a project.


example1:
```yaml
group: laplacian
name: model.metamodel
type: model
namespace: laplacian
description: |
  A model that expresses the structure of relational model with aggregation support.
  This model is used to define models from which templates generate resources such as source code or document.
version: '1.0.0'
source_repository:
  url: https://github.com/nabla-squared/laplacian.model.metamodel.git
  branch: master
base_dir: subprojects/laplacian.model.metamodel
templates:
- group: laplacian
  name: template.project.base
  version: '1.0.0'

```

example2:
```yaml
group: laplacian
name: model.metamodel
type: model
namespace: laplacian
description: |
  A model that expresses the structure of relational model with aggregation support.
  This model is used to define models from which templates generate resources such as source code or document.
version: '1.0.0'
source_repository:
  url: https://github.com/nabla-squared/laplacian.model.metamodel.git
  branch: master
base_dir: subprojects/laplacian.model.metamodel
templates:
- group: laplacian
  name: template.project.base
  version: '1.0.0'

```


---

## Properties

### group: `String`
The group of this project.
- **Attributes:** *PK*

### name: `String`
The name of this project.
- **Attributes:** *PK*

### type: `String`
The type of this project.
- **Default Value:**
  ```kotlin
  "generator"
  ```

### author: `String`
The author of this project.

### licensor: `String`
The licensor of this project.
- **Default Value:**
  ```kotlin
  author
  ```

### license: `String`
The license of this project.

### role: `String`
The role of this project.
- **Code:**
  ```kotlin
  projectType.role
  ```

### version: `String`
The version of this project.

### namespace: `String`
The namespace of this project.
- **Default Value:**
  ```kotlin
  listOf(group, name)
      .map{ it.lowerUnderscorize() }
      .joinToString(".")
  ```

### model_files: `List<String>`
The model_files of this project.

### template_files: `List<String>`
The template_files of this project.

### base_dir: `String`
The base_dir of this project.
- **Default Value:**
  ```kotlin
  "subprojects/${name.lowerHyphenize()}"
  ```

### is_model: `Boolean`
Defines this project is is_model or not.
- **Code:**
  ```kotlin
  role == "model"
  ```

### is_template: `Boolean`
Defines this project is is_template or not.
- **Code:**
  ```kotlin
  role == "template"
  ```

### is_plugin: `Boolean`
Defines this project is is_plugin or not.
- **Code:**
  ```kotlin
  role == "plugin"
  ```

### is_domain_model: `Boolean`
Defines this project is is_domain_model or not.
- **Code:**
  ```kotlin
  type == "domain-model"
  ```

### is_domain_model_plugin: `Boolean`
Defines this project is is_domain_model_plugin or not.
- **Code:**
  ```kotlin
  type == "domain-model-plugin"
  ```

### sources: `List<String>`
The sources of this project.

## Relationships

### description: `MultilingualText?`
The description of this project.
- **Cardinality:** `0..1`

### project_type: `ProjectType`
The project_type of this project.
- **Cardinality:** `1`

### parent_project: `Project?`
The parent_project of this project.
- **Cardinality:** `0..1`

### subprojects: `List<Project>`
The subprojects of this project.
- **Cardinality:** `*`

### source_repository: `SourceRepository?`
The source_repository of this project.
- **Cardinality:** `0..1`

### module_repositories: `ModuleRepositoryList?`
The module_repositories of this project.
- **Cardinality:** `0..1`

### document: `Document?`
The document of this project.
- **Cardinality:** `0..1`

### scripts: `List<Script>`
The scripts of this project.
- **Cardinality:** `*`

### models: `List<Module>`
The models of this project.
- **Cardinality:** `*`

### templates: `List<Module>`
The templates of this project.
- **Cardinality:** `*`

### plugins: `List<Module>`
The plugins of this project.
- **Cardinality:** `*`

### all_models: `List<Module>`
The all_models of this project.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  (projectType.allModels + models).distinctBy{ "${it.group}:${it.name}" }
  ```

### all_templates: `List<Module>`
The all_templates of this project.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  (projectType.allTemplates + templates).distinctBy{ "${it.group}:${it.name}" }
  ```

### all_plugins: `List<Module>`
The all_plugins of this project.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  (projectType.allPlugins + plugins).distinctBy{ "${it.group}:${it.name}" }
  ```