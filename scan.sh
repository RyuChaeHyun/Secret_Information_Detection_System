#!/bin/bash

# Git 리포지토리 URL
REPO_URL=$1
TEMP_DIR=$(mktemp -d)

# Git 리포지토리 클론
git clone $REPO_URL $TEMP_DIR

# Trivy로 비밀 정보 스캔
docker run --rm -v $TEMP_DIR:/repo aquasec/trivy fs --scanners secret /repo

# 클론한 디렉토리 삭제
rm -rf $TEMP_DIR

