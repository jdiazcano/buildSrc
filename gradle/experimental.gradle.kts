extensions.configure(org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension::class.java) {
    sourceSets.configureEach {
        languageSettings.apply {
            useExperimentalAnnotation("kotlin.time.ExperimentalTime")
            useExperimentalAnnotation("kotlinx.coroutines.ExperimentalCoroutinesApi")
        }
    }
}