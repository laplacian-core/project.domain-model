#!/usr/bin/env bash
set -e
PROJECT_BASE_DIR=$(cd $"${BASH_SOURCE%/*}/../" && pwd)

SCRIPT_BASE_DIR="$PROJECT_BASE_DIR/scripts"
LOCAL_REPO_PATH='../mvn-repo'
SUBPROJECTS='subprojects/laplacian.project.domain-model-plugin
'

for subproject in $SUBPROJECTS
do
  if [[ -d "$subproject/.git" ]]
  then
    echo "
    === $subproject ===
    "
    (cd $subproject && git status)
  fi
done