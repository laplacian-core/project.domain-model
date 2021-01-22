# **ProjectType**
**namespace:** laplacian.project

An entity describing a project_type.



---

## Properties

### name: `String`
The name of this project_type.
- **Attributes:** *PK*

### role: `String`
The role of this project_type.
- **Default Value:**
  ```kotlin
  baseType?.role ?: "generator"
  ```

### description: `String`
The description of this project_type.
- **Default Value:**
  ```kotlin
  name
  ```

### base_type_name: `String`
The base_type_name of this project_type.

## Relationships

### base_type: `ProjectType?`
The base_type of this project_type.
- **Cardinality:** `0..1`

### models: `List<Module>`
The models of this project_type.
- **Cardinality:** `*`

### templates: `List<Module>`
The templates of this project_type.
- **Cardinality:** `*`

### plugins: `List<Module>`
The plugins of this project_type.
- **Cardinality:** `*`

### all_models: `List<Module>`
The all_models of this project_type.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  ((baseType?.allModels ?: emptyList()) + models).distinctBy{ "${it.group}:${it.name}" }
  ```

### all_templates: `List<Module>`
The all_templates of this project_type.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  ((baseType?.allTemplates ?: emptyList()) + templates).distinctBy{ "${it.group}:${it.name}" }
  ```

### all_plugins: `List<Module>`
The all_plugins of this project_type.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  ((baseType?.allPlugins ?: emptyList()) + plugins).distinctBy{ "${it.group}:${it.name}" }
  ```