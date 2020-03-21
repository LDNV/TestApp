#!/usr/bin/env bash

echo "This is an App Center Pre-Build script. For more information on how to use App Center build scripts vist: https://docs.microsoft.com/en-us/appcenter/build/custom/scripts"

for entry in /Users/runner/runners/2.165.2/work/1/s/app/*
do
  echo "$entry"
done