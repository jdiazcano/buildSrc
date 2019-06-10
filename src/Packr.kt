import com.badlogicgames.packr.Packr
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import com.badlogicgames.packr.PackrConfig
import java.io.File

open class PackrTask: DefaultTask() {

    var jdk: String = "/Users/javier/.sdkman/candidates/java/8.0.212-amzn"
    var executable: String = "Orion"
    var classpath: List<String> = arrayListOf()
    var mainClass: String = ""
    var vmArgs: List<String> = arrayListOf()
    var minimizeJre: String = "soft"

    private val platforms = arrayListOf(
            PackrConfig.Platform.MacOS
//            PackrConfig.Platform.Windows64,
//            PackrConfig.Platform.Linux64
    )

    @TaskAction
    fun pack() {
        validate()

        platforms.forEach {
            val config = PackrConfig()

            config.platform = it
            config.jdk = jdk
            config.executable = executable
            config.classpath = classpath
            config.mainClass = mainClass
            config.vmArgs = vmArgs + (if (it == PackrConfig.Platform.MacOS) arrayListOf("-XstartOnFirstThread") else arrayListOf())
            config.minimizeJre = minimizeJre
            config.outDir = File("build").resolve("packr").resolve(it.name + ".app")

            Packr().pack(config)
        }
    }

    fun validate() {
        val emptyVariables = arrayListOf<String>()
        if (jdk.isEmpty()) {
            emptyVariables += "jdk"
        }
        if (executable.isEmpty()) {
            emptyVariables += "executable"
        }
        if (mainClass.isEmpty()) {
            emptyVariables += "mainClass"
        }

        if (emptyVariables.isNotEmpty()) {
            throw IllegalArgumentException("These variables cannot be empty: ${emptyVariables.joinToString(", ")}")
        }
    }

}