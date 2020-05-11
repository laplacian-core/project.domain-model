#!/usr/bin/env bash
set -e
PROJECT_BASE_DIR=$(cd $"${BASH_SOURCE%/*}/../../" && pwd)

SCRIPT_BASE_DIR="$PROJECT_BASE_DIR/scripts"
LOCAL_REPO_PATH="$PROJECT_BASE_DIR/../../../mvn-repo"

TARGET_PROJECT_DIR="$PROJECT_BASE_DIR/subprojects/laplacian.project.domain-model-plugin"
TARGET_MODEL_DIR="$TARGET_PROJECT_DIR/model"
TARGET_PROJECT_MODEL_FILE="$TARGET_MODEL_DIR/project.yaml"

GENERATOR_SCRIPT_FILE_NAME=generate.sh
TARGET_SCRIPT_DIR="$TARGET_PROJECT_DIR/scripts"
TARGET_PROJECT_GENERATOR_SCRIPT="$TARGET_SCRIPT_DIR/$GENERATOR_SCRIPT_FILE_NAME"

main() {
  create_project_model_file
  install_generator
  trap run_generator 0
}

create_project_model_file() {
  mkdir -p $TARGET_MODEL_DIR
  cat <<END_FILE > $TARGET_PROJECT_MODEL_FILE
project:
  group: laplacian
  name: project.domain-model-plugin
  type: domain-model-plugin
  namespace: laplacian.project
  version: '1.0.0'
  description:
    en: |
      A domain model plugin module for the project.domain-model.
    ja: |
      project.domain-model のドメインモデルプラグインモジュール
    zh: |
      project.domain-model 域模型插件模块
  module_repositories:
    local:
      path: ../../../../../mvn-repo
      url: https://github.com/nabla-squared/mvn-repo
      branch: master
    remote:
    - https://github.com/nabla-squared/mvn-repo
  plugins:
  - group: laplacian
    name: common-model-plugin
    version: '1.0.0'
  models:
  - group: laplacian
    name: project.domain-model
    version: '1.0.0'
  - group: laplacian
    name: common-model
    version: '1.0.0'
END_FILE
}



install_generator() {
  mkdir -p $TARGET_SCRIPT_DIR
  (cd $TARGET_PROJECT_DIR
    curl -Ls https://git.io/fhxcl | bash
  )
}

run_generator() {
  ${TARGET_SCRIPT_DIR}/laplacian-generate.sh \
    --plugin 'laplacian:laplacian.project.schema-plugin:1.0.0' \
    --plugin 'laplacian:laplacian.common-model-plugin:1.0.0' \
    --model 'laplacian:laplacian.project.project-types:1.0.0' \
    --model 'laplacian:laplacian.common-model:1.0.0' \
    --template 'laplacian:laplacian.generator.project-template:1.0.0' \
    --model-files './model/project.yaml' \
    --model-files './model/project' \
    --target-dir './' \
    --local-repo "$LOCAL_REPO_PATH"
}

main