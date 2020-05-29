# **Document**
**namespace:** laplacian.project

document



---

## Properties

### title: `String`
The title of this document.
- **Default Value:**
  ```kotlin
  "${project.group}/${project.name}"
  ```

### author: `String`
The author of this document.

### rights: `String`
The rights of this document.

### abstract: `String`
The abstract of this document.
- **Default Value:**
  ```kotlin
  "${project.description}"
  ```

## Relationships

### project: `Project`
project
- **Cardinality:** `1`

### sections: `List<Section>`
sections
- **Cardinality:** `*`

### languages: `List<DocumentLanguage>`
languages
- **Cardinality:** `1..*`