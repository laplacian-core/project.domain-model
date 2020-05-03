# **Project**
**namespace:** laplacian.project

project


example1:
```yaml
group: laplacian
  name: model.metamodel
  type: model
  namespace: laplacian
  description: |
    A model that expresses the structure of relational model with aggregation support.
    This model is used to define models from which templates generate resources such as source code or document.
  version: 1.0.0
  source_repository:
    url: https://github.com/nabla-squared/laplacian.model.metamodel.git
    branch: master
  base_dir: subprojects/laplacian.model.metamodel
  templates:
  - group: laplacian
    name: template.project.base
    version: 1.0.0
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
  "subprojects/${group}.${name}"
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

## Relationships

### description: `MultilingualText?`
description
- **Cardinality:** `0..1`

### project_type: `ProjectType`
project_type
- **Cardinality:** `1`

### parent_project: `Project?`
parent_project
- **Cardinality:** `0..1`

### subprojects: `List<Project>`
subprojects
- **Cardinality:** `*`

### source_repository: `SourceRepository?`
source_repository
- **Cardinality:** `0..1`

### document: `Document?`
document
- **Cardinality:** `0..1`

### scripts: `List<Script>`
scripts
- **Cardinality:** `*`

### models: `List<Module>`
models
- **Cardinality:** `*`

### templates: `List<Module>`
templates
- **Cardinality:** `*`

### plugins: `List<Module>`
plugins
- **Cardinality:** `*`

### all_models: `List<Module>`
all_models
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  (projectType.allModels + models).distinctBy{ "${it.group}:${it.name}" }
  ```

### all_templates: `List<Module>`
all_templates
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  (projectType.allTemplates + templates).distinctBy{ "${it.group}:${it.name}" }
  ```

### all_plugins: `List<Module>`
all_plugins
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  (projectType.allPlugins + plugins).distinctBy{ "${it.group}:${it.name}" }
  ```