# **Document**
**namespace:** laplacian.project

An entity describing a document.



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
The project of this document.
- **Cardinality:** `1`

### sections: `List<Section>`
The sections of this document.
- **Cardinality:** `*`

### languages: `List<DocumentLanguage>`
The languages of this document.
- **Cardinality:** `1..*`