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
    compile("com.amazonaws:aws-java-sdk-s3:1.11.564")
}