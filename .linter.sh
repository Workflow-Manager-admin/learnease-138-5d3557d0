#!/bin/bash
cd /home/kavia/workspace/code-generation/learnease-138-5d3557d0/learnease_frontend
./gradlew lint
LINT_EXIT_CODE=$?
if [ $LINT_EXIT_CODE -ne 0 ]; then
   exit 1
fi

