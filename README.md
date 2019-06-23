[![CircleCI](https://circleci.com/gh/nabla-squared/laplacian.model.project.svg?style=shield)](https://circleci.com/gh/nabla-squared/laplacian.model.project)

# laplacian:model:project

The model which expresses the logical structure of laplacian-based projects and modules





## The structure of the *project* model

The following diagram summarizes the structure of the model:

![](https://raw.githubusercontent.com/nabla-squared/laplacian.model.project/master/doc/image/model-diagram.svg?sanitize=true)


As shown in above diagram, this model depends on the following external models.

- *metamodel* (laplacian.model.metamodel)



## Getting started

Firstly, you need to add the following entry to your `laplacian-module.yml` :

```yaml
project:
  group: ${your.project.group}
  name: ${your.project.name}
  type: project
  version: "1.0.0"
  models:
  ## ↓↓ ADD ↓↓ ##
  - group: laplacian
    name: project
    version: "1.0.0"
  ## ↑↑ ADD ↑↑ ##
```

To reflect the change, you need to type the following command in your console :
```bash
./gradlew lM
```

Then put some template files under the *./template* directory and type the following command to generate files:
```bash
./gradlew lG
```