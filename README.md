### Project Structure
- `app` - Main Android Application module
- `network` - JVM dependency module
- `kover` - Android module - only used for running kover

### Kover Issue

Change the `kover` version at [libs.versions.toml:36](https://github.com/ben-gooding-sky/kover-bug-example/blob/main/gradle/libs.versions.toml) to 0.7.3 for a working build

to test `kover` run `rm -rf kover/build/ && ./gradlew :kover:koverHtmlReport`

Also for android specific testing (should also error)

to test `kover` run `rm -rf kover/build/ && ./gradlew :kover:koverHtmlReportDebug`


#### JVM only module test works

By commenting out `mergeWith("debug")` you can run the coverage test for JVM modules

this doesn't include `app` module's tests -> this is working as expected

