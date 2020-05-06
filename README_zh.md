<!-- @head-content@ -->
# laplacian/project.schema-model

该模型代表了*Laplacian*项目的逻辑结构。


*Read this in other languages*: [[English](README.md)] [[日本語](README_ja.md)]
<!-- @head-content@ -->

<!-- @toc@ -->
## Table of contents
1. [概述](#概述)
1. [如何使用](#如何使用)
1. [索引](#索引)


<!-- @toc@ -->

<!-- @main-content@ -->
## 概述


### 模式概述


下面的图表显示了本模块所包含的每个实体的内容以及它们之间的关系。
![](./doc/image/model-diagram.svg)
### 实体清单


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
- [**Script**](<./doc/entities/Script.md>)
script
- [**Option**](<./doc/entities/Option.md>)
option
- [**SourceRepository**](<./doc/entities/SourceRepository.md>)
source_repository

## 如何使用

要应用此model模块，请在项目定义中加入以下条目

```yaml
project:
  models:
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
- [src/entities/document/section.yaml](<./src/entities/document/section.yaml>)
- [src/entities/document.yaml](<./src/entities/document.yaml>)
- [src/entities/module.yaml](<./src/entities/module.yaml>)
- [src/entities/project/examples.yaml](<./src/entities/project/examples.yaml>)
- [src/entities/project_type.yaml](<./src/entities/project_type.yaml>)
- [src/entities/project.yml](<./src/entities/project.yml>)
- [src/entities/script/option.yaml](<./src/entities/script/option.yaml>)
- [src/entities/script.yaml](<./src/entities/script.yaml>)
- [src/entities/source_repository.yaml](<./src/entities/source_repository.yaml>)


<!-- @main-content@ -->