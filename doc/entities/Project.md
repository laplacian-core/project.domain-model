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

### description: `String`
The description of this project.
- **Default Value:**
  ```kotlin
  "${group}:${name}"
  ```

### base_dir: `String`
The base_dir of this project.
- **Default Value:**
  ```kotlin
  "subprojects/${group}.${name}"
  ```

## Relationships

### parent_project: `Project?`
parent_project
- **Cardinality:** `0..1`

### subprojects: `List<Project>`
subprojects
- **Cardinality:** `*`

### source_repository: `SourceRepository?`
source_repository
- **Cardinality:** `0..1`

### models: `List<Module>`
models
- **Cardinality:** `*`

### templates: `List<Module>`
templates
- **Cardinality:** `*`

### schemas: `List<Module>`
schemas
- **Cardinality:** `*`