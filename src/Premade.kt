import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.DependencyHandler

object Premade {
    val kotlin = listOf(
            Libraries.jetbrains.kotlin.stdlib
    )

    val testing = listOf(
            Libraries.kotlintest.core,
            Libraries.kotlintest.junitrunner
    )

    val logging = listOf(
            Libraries.logging,
            Libraries.log4j.log4j2,
            Libraries.log4j.log4j2slf4j
    )

    val cfg4k = listOf(
            Libraries.cfg4k.core,
            Libraries.cfg4k.json
    )

    val libgdx = listOf(
            Libraries.libgdx.gdx,
            Libraries.libgdx.lwjgl3,
            Libraries.libgdx.nativesDesktop
    )

}

@Deprecated("Now is implementation/api", ReplaceWith("implementationBatch"))
fun DependencyHandler.compileBatch(dependencyNotations: List<Any>): List<Dependency?> =
        dependencyNotations.map { add("compile", it) }

@Deprecated("Now is implementation/api", ReplaceWith("testImplementationBatch"))
fun DependencyHandler.testCompileBatch(dependencyNotations: List<Any>): List<Dependency?> =
        dependencyNotations.map { add("testCompile", it) }

fun DependencyHandler.implementationBatch(dependencyNotations: List<Any>): List<Dependency?> =
        dependencyNotations.map { add("implementation", it) }

fun DependencyHandler.testImplementationBatch(dependencyNotations: List<Any>): List<Dependency?> =
        dependencyNotations.map { add("testImplementation", it) }
