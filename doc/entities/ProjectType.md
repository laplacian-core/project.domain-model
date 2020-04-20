# **ProjectType**
**namespace:** laplacian.project

project_type



---

## Properties

### name: `String`
The name of this project_type.
- **Attributes:** *PK*

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
base_type
- **Cardinality:** `0..1`

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
  ((baseType?.allModels ?: emptyList()) + models).distinctBy{ "${it.group}:${it.name}" }
  ```

### all_templates: `List<Module>`
all_templates
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  ((baseType?.allTemplates ?: emptyList()) + templates).distinctBy{ "${it.group}:${it.name}" }
  ```

### all_plugins: `List<Module>`
all_plugins
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  ((baseType?.allPlugins ?: emptyList()) + plugins).distinctBy{ "${it.group}:${it.name}" }
  ```