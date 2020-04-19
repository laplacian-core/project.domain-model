<!-- @head-content@ -->
# laplacian/project.schema-model

A model which expresses the logical structure of laplacian-based projects and modules.

<!-- @head-content@ -->

<!-- @toc -->
## Table of contents
1. [Usage](#usage)

1. [Schema model](#schema-model)

1. [Source list](#source-list)



<!-- @toc -->

<!-- @main-content -->
## Usage

Add the following entry to your project definition.
```yaml
project:
  models:
  - group: laplacian
    name: project.schema-model
    version: 1.0.0
```



## Schema model


### Model overview

The following diagram summarizes the structure of the model:
![](./doc/image/model-diagram.svg)


### Entities

- [**Document**](<./doc/entities/Document.md>)
  document
- [**Section**](<./doc/entities/Section.md>)
  section
- [**Module**](<./doc/entities/Module.md>)
  module
- [**Project**](<./doc/entities/Project.md>)
  project
- [**ProjectType**](<./doc/entities/ProjectType.md>)
  project_type
- [**SourceRepository**](<./doc/entities/SourceRepository.md>)
  source_repository




## Source list


[src/entities/laplacian/module.yaml](<./src/entities/laplacian/module.yaml>)

[src/entities/laplacian/document_section.yaml](<./src/entities/laplacian/document_section.yaml>)

[src/entities/laplacian/document.yaml](<./src/entities/laplacian/document.yaml>)

[src/entities/laplacian/source_repository.yaml](<./src/entities/laplacian/source_repository.yaml>)

[src/entities/laplacian/project_type.yaml](<./src/entities/laplacian/project_type.yaml>)

[src/entities/laplacian/project/examples.yaml](<./src/entities/laplacian/project/examples.yaml>)

[src/entities/laplacian/project.yml](<./src/entities/laplacian/project.yml>)

[.editorconfig](<./.editorconfig>)

[.gitignore](<./.gitignore>)

[doc/image/model-diagram.svg](<./doc/image/model-diagram.svg>)

[doc/entities/Section.md](<./doc/entities/Section.md>)

[doc/entities/Document.md](<./doc/entities/Document.md>)

[doc/entities/Module.md](<./doc/entities/Module.md>)

[doc/entities/ProjectType.md](<./doc/entities/ProjectType.md>)

[doc/entities/DocumentChapter.md](<./doc/entities/DocumentChapter.md>)

[doc/entities/SourceRepository.md](<./doc/entities/SourceRepository.md>)

[doc/entities/Project.md](<./doc/entities/Project.md>)

[README.md](<./README.md>)

[.gitattributes](<./.gitattributes>)

[model/project.yaml](<./model/project.yaml>)

[model/project/sources.yaml](<./model/project/sources.yaml>)





<!-- @main-content -->