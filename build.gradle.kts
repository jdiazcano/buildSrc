plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    jcenter()
}

sourceSets.main {
    java {
        setSrcDirs(listOf("src"))
    }
}