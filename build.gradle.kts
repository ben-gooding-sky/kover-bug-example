// Top-level build file where you can add configuration options common to all sub-projects/modules.
@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kover)
}
subprojects {
    apply {
        plugin(rootProject.libs.plugins.kover.get().pluginId)
    }
    pluginManager.withPlugin(rootProject.libs.plugins.kover.get().pluginId) {
        koverReport {
            filters {
                excludes {
                    classes(
                        "*.BuildConfig",
                        "*.extensions.*"
                    )
                    packages("*.di", "*.ext")
                    annotatedBy("androidx.compose.ui.tooling.preview.Preview")
                    annotatedBy("androidx.compose.runtime.Composable")
                }
            }
        }
    }
    pluginManager.withPlugin(rootProject.libs.plugins.kover.get().pluginId) {
        koverReport {
            filters {
                excludes {
                    classes(
                        "*.BuildConfig",
                        "*.extensions.*"
                    )
                    packages("*.di", "*.ext")
                    annotatedBy("androidx.compose.ui.tooling.preview.Preview")
                    annotatedBy("androidx.compose.runtime.Composable")
                }
            }
        }
    }
}