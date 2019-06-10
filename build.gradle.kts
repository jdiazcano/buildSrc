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

dependencies {
    compile("com.bladecoder.packr:packr:2.1")
}