apply(plugin = "jacoco")

project.extensions.configure<JacocoPluginExtension>("jacoco") {
    toolVersion = Versions.jacoco
}

val jacocoTestReport by tasks.existing(JacocoReport::class) {
    reports {
        xml.isEnabled = true
        html.isEnabled = true
    }
}

val check by tasks.existing {
    dependsOn(jacocoTestReport)
}