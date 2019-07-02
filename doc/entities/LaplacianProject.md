# **LaplacianProject**
**namespace:** laplacian.project

laplacian_project



---

## Properties

### namespace: `String`
The namespace of this laplacian_project.
- **Default Value:**
  ```kotlin
  listOfNotNull(group, name, subname)
      .map{ it.lowerUnderscorize() }
      .joinToString(".")
  ```

## Relationships

### parent_project: `LaplacianProject?`
parent_project
- **Cardinality:** `0..1`

### subprojects: `List<LaplacianProject>`
subprojects
- **Cardinality:** `*`

### generators: `List<LaplacianGenerator>`
generators
- **Cardinality:** `*`