tasks.register<Jar>("fatjar") {
    manifest {
        attributes["Main-class"] = project.extra["mainClass"]
    }

    from(Callable { configurations["runtimeClasspath"].map { if (it.isDirectory) it else zipTree(it) } })
    with(tasks["jar"] as CopySpec)
}