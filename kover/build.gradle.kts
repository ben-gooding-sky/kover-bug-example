plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    alias(libs.plugins.kover)
}

android {
    namespace = "bug.kover"
    compileSdk = 34
    kotlin {
        jvmToolchain(17)
    }
    defaultConfig {
        minSdk = 24
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

val excludes = listOf(
    "kover",
)

koverReport {
    defaults {
        mergeWith("debug")
    }
}

dependencies {
    rootProject.subprojects.forEach { project ->
        if (project.name !in excludes) {
            kover(project(project.path))
        }
    }
}
