#!/usr/bin/env bash

echo "Benjamin: This is an App Center Post-Build script. For more information on how to use App Center build scripts vist: https://docs.microsoft.com/en-us/appcenter/build/custom/scripts"

for entry in /Users/runner/runners/2.165.2/work/1/s/app/build/outputs/apk/*
do
  echo "$entry"
done

appcenter test run espresso --app "BenjaminRangel/TestApp" --devices 1dce183a --app-path "/app/build/outputs/apk/prod/release/app-prod-release.apk" --test-series "master" --locale "en_US" --build-dir "app/build/outputs/apk/androidTest/prod/debug"
