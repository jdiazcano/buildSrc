apply(plugin = "maven-publish")

val Project.`sourceSets`: SourceSetContainer get() = extensions.getByName("sourceSets") as SourceSetContainer

val sourcesJar by tasks.registering(Jar::class) {
    classifier = "sources"
    from(sourceSets.getByName("main").allSource)
}

project.extensions.configure<PublishingExtension>("publishing") {
    publications {
        register<MavenPublication>("mavenJava") {
            from(components["java"])
            artifact(sourcesJar.get())
        }
    }
}

tasks {
    val install by registering
    afterEvaluate {
        val publishToMavenLocal by existing
        install.configure { dependsOn(publishToMavenLocal) }
    }
}