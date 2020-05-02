<!-- @head-content@ -->
# laplacian/project.schema-model

A model which expresses the logical structure of laplacian-based projects and modules.


*Read this in other languages*: [[English](README.md)] [[日本語](README_ja.md)]
<!-- @head-content@ -->

<!-- @toc@ -->
## Table of contents
1. [如何使用](#如何使用)
1. [索引](#索引)


<!-- @toc@ -->

<!-- @main-content@ -->
## 如何使用

要应用此domain-model模块，请在项目定义中加入以下条目

```yaml
project:
  domain-models:
  - group: laplacian
    name: project.schema-model
    version: 1.0.0
```

您可以运行以下命令查看受本模块应用影响的资源列表及其内容

```console
$ ./script/generate --dry-run

diff --color -r PROJECT_HOME/.NEXT/somewhere/something.md PROJECT_HOME/somewhere/something.md
1,26c1,10
< content: OLD CONTENT
---
> content: NEW CONTENT
```

如果没有问题，请执行下面的命令来反映变化

```console
$ ./script/generate --dry-run

```


## 索引


### 源码列表


- [model/project.yaml](<./model/project.yaml>)
- [src/entities/laplacian/document_section.yaml](<./src/entities/laplacian/document_section.yaml>)
- [src/entities/laplacian/document.yaml](<./src/entities/laplacian/document.yaml>)
- [src/entities/laplacian/module.yaml](<./src/entities/laplacian/module.yaml>)
- [src/entities/laplacian/project/examples.yaml](<./src/entities/laplacian/project/examples.yaml>)
- [src/entities/laplacian/project_type.yaml](<./src/entities/laplacian/project_type.yaml>)
- [src/entities/laplacian/project.yml](<./src/entities/laplacian/project.yml>)
- [src/entities/laplacian/source_repository.yaml](<./src/entities/laplacian/source_repository.yaml>)


<!-- @main-content@ -->