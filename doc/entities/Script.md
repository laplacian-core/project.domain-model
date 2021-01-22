# **Script**
**namespace:** laplacian.project

An entity describing a script.



---

## Properties

### name: `String`
The name of this script.
- **Attributes:** *PK*

## Relationships

### description: `MultilingualText?`
The description of this script.
- **Cardinality:** `0..1`

### options: `List<Option>`
The options of this script.
- **Cardinality:** `*`