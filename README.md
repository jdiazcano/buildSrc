## What is this

Build src project to be used as a git submodule in every other project in order to get a better compilation of dependencies
and do not look for them every single time.

## Example usage

1. Add it as a git submodule `git submodule add git@github.com:jdiazcano/buildSrc.git`
1. In your `build.gradle.kts`, use: `compile(Libraries.gson)`