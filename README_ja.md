<!-- @head-content@ -->
# laplacian/project.schema-model

A model which expresses the logical structure of laplacian-based projects and modules.


*Read this in other languages*: [[English](README.md)] [[简体中文](README_zh.md)]
<!-- @head-content@ -->

<!-- @toc@ -->
## Table of contents
1. [使用方法](#使用方法)
1. [インデックス](#インデックス)


<!-- @toc@ -->

<!-- @main-content@ -->
## 使用方法

この domain-modelモジュールを適用するには、プロジェクト定義に以下のエントリを追加してください。
```yaml
project:
  domain-models:
  - group: laplacian
    name: project.schema-model
    version: 1.0.0
```

下記のコマンドを実行すると、このモジュールの適用によって影響を受ける資源の一覧とその内容を確認できます。

```console
$ ./script/generate --dry-run

diff --color -r PROJECT_HOME/.NEXT/somewhere/something.md PROJECT_HOME/somewhere/something.md
1,26c1,10
< content: OLD CONTENT
---
> content: NEW CONTENT
```

内容に問題が無ければ、下記コマンドを実行して変更を反映してください。

```console
$ ./script/generate --dry-run

```


## インデックス


### ソースコード一覧


- [model/project.yaml](<./model/project.yaml>)
- [src/entities/laplacian/document_section.yaml](<./src/entities/laplacian/document_section.yaml>)
- [src/entities/laplacian/document.yaml](<./src/entities/laplacian/document.yaml>)
- [src/entities/laplacian/module.yaml](<./src/entities/laplacian/module.yaml>)
- [src/entities/laplacian/project/examples.yaml](<./src/entities/laplacian/project/examples.yaml>)
- [src/entities/laplacian/project_type.yaml](<./src/entities/laplacian/project_type.yaml>)
- [src/entities/laplacian/project.yml](<./src/entities/laplacian/project.yml>)
- [src/entities/laplacian/source_repository.yaml](<./src/entities/laplacian/source_repository.yaml>)


<!-- @main-content@ -->