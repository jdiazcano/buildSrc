configure<SourceSetContainer> {
    val main by getting
    main.java {
        setSrcDirs(listOf("src"))
    }
}

configure<SourceSetContainer> {
    val main by getting
    main.resources {
        setSrcDirs(listOf("src"))
    }
}

configure<SourceSetContainer> {
    val test by getting
    test.java {
        setSrcDirs(listOf("tst"))
    }
}

configure<SourceSetContainer> {
    val test by getting
    test.resources {
        setSrcDirs(listOf("tstsrc"))
    }
}