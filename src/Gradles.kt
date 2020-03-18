import org.gradle.api.Project
import org.gradle.api.plugins.PluginAware
import org.gradle.kotlin.dsl.apply
import kotlin.reflect.KProperty

object Gradles {
    val fatjar by Gradle
    val javaeight by Gradle
    val publications by Gradle
    val repositories by Gradle
    val sourcesets by Gradle
    val jacoco by Gradle
    val experimental by Gradle

    val all = listOf(fatjar, javaeight, publications, repositories, sourcesets, jacoco)

    private object Gradle {
        operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
            return "buildSrc/gradle/${property.name}.gradle.kts"
        }
    }
}

fun PluginAware.applyFromAll(files: List<String>) = files.forEach { apply(from = it) }

fun Project.baseProject(configuration: ProjectConfiguration) {
    applyFromAll(Gradles.all)

    group = configuration.group
    version = configuration.version
}

data class ProjectConfiguration(
        val group: String,
        val version: String
)
