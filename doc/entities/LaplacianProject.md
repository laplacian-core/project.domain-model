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

### generators: `List<LaplacianGenerator>`
generators
- **Cardinality:** `1..*`