#!/usr/bin/env bash

SUBPROJECTS='subprojects/laplacian.project.domain-model-plugin
'

main() {
  for subproject in $SUBPROJECTS
  do
    local path="$PROJECT_BASE_DIR/$subproject"
    if [[ -d "$path/.git" ]]
    then
      echo "
      === $subproject ===
      "
      (cd $path
        $ARGS
      )
    fi
  done
}