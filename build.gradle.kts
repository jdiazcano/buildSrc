plugins {
    `kotlin-dsl`
}

apply(from = "gradle/sourcesets.gradle.kts")
apply(from = "gradle/repositories.gradle.kts")

dependencies {
    compile("com.bladecoder.packr:packr:2.1")
    compile("com.amazonaws:aws-java-sdk-s3:1.11.564")
}