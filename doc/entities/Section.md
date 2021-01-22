# **Section**
**namespace:** laplacian.project.document

An entity describing a section.



---

## Properties

### name: `String`
The name of this section.
- **Attributes:** *PK*

### order: `Int`
The order of this section.
- **Default Value:**
  ```kotlin
  9999
  ```

## Relationships

### title: `MultilingualText`
The title of this section.
- **Cardinality:** `1`

### content: `MultilingualText?`
The content of this section.
- **Cardinality:** `0..1`

### sub_sections: `List<Section>`
The sub_sections of this section.
- **Cardinality:** `*`

### parent_section: `Section?`
The parent_section of this section.
- **Cardinality:** `0..1`