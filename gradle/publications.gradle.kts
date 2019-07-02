apply(plugin = "maven-publish")

val Project.`sourceSets`: SourceSetContainer get() = extensions.getByName("sourceSets") as SourceSetContainer

val sourcesJar by tasks.registering(Jar::class) {

    classifier = "sources"
    from(sourceSets.getByName("main").allSource)
}
project.extensions.configure<PublishingExtension>("publishing") {
    publications {
        register("mavenJava", MavenPublication::class) {
            from(components["java"])
            artifact(sourcesJar.get())
        }
    }
}