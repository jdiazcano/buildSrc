import org.gradle.api.Project
import org.gradle.api.artifacts.dsl.RepositoryHandler
import org.gradle.api.publish.PublishingExtension
import org.gradle.kotlin.dsl.maven

fun RepositoryHandler.jitpack() {
    maven("https://jitpack.io")
}

fun Project.githubPublishing(user: String, repo: String) {
    extensions.configure<PublishingExtension>("publishing") {
        repositories {
            maven("https://maven.pkg.github.com/$user/$repo") {
                name = "github"
                credentials {
                    username = System.getenv("GITHUB_OWN_USERNAME")
                    password = System.getenv("GITHUB_TOKEN_PKG_REGISTRY")
                }
            }
        }
    }
}