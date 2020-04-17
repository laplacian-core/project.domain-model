# **Section**
**namespace:** laplacian.project.document

section



---

## Properties

### title: `String`
The title of this section.

### content: `String`
The content of this section.

### included_if: `String`
The included_if of this section.
- **Default Value:**
  ```kotlin
  'true'
  ```

## Relationships

### sub_sections: `List<Section>`
sub_sections
- **Cardinality:** `*`

### parent_section: `Section?`
parent_section
- **Cardinality:** `0..1`