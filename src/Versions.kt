object Versions {
    val kotlin: String = "1.3.0"
    object jetbrains {
        val kotlin = "1.2.71"
        val spek = "1.1.2"
        val engine = "1.2.0"
    }
    val bytebuddy = "1.8.15"
    val klaxon = "3.0.6"
    val typesafe = "1.3.3"
    val jgit = "4.9.0.201710071750-r"
    val expekt = "0.5.0"
    val junit = "5.3.1"
    val snakeyaml = "1.21"
    val jcommander = "1.72"
    val mockwebserver = "3.11.0"
    val aws = "1.11.380"
    val logging = "1.5.4"
    val libgdx = "1.9.8"
    val libktx = "1.9.8-b5"
    val cfg4k = "0.9.0"
    val rxkotlin = "2.2.0"
    val kodein = "5.3.0"
    val gson = "2.8.5"
    val mockk = "1.8.9"
    val bouncycastle = "1.58"
    val retrofit = "2.3.0"
    val slf4j = "1.7.25"
    val log4j2 = "2.11.1"
    val ktor = "1.1.3"
    object apache {
        object commons {
            val commons = "3.6"
            val io = "2.5"
        }

    }
}

object Libraries {
    object eclipse {
        val jgit = "org.eclipse.jgit:org.eclipse.jgit:${Versions.jgit}"
    }

    object jetbrains {
        object kotlin {
            val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.jetbrains.kotlin}"
            val reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.jetbrains.kotlin}"
            val test = "org.jetbrains.kotlin:kotlin-test:${Versions.jetbrains.kotlin}"
        }

        object spek {
            val api = "org.jetbrains.spek:spek-api:${Versions.jetbrains.engine}"
            val engine = "org.jetbrains.spek:spek-junit-platform-engine:${Versions.jetbrains.engine}"
        }
    }

    object junit {
        val api = "org.junit.jupiter:junit-jupiter-api:${Versions.junit}"
        val engine = "org.junit.jupiter:junit-jupiter-engine:${Versions.junit}"
        val params = "org.junit.jupiter:junit-jupiter-params:${Versions.junit}"
    }

    val expekt = "com.winterbe:expekt:${Versions.expekt}"
    val bytebuddy = "net.bytebuddy:byte-buddy:${Versions.bytebuddy}"
    val typesafe = "com.typesafe:config:${Versions.typesafe}"
    val snakeyaml = "org.yaml:snakeyaml:${Versions.snakeyaml}"
    val klaxon = "com.beust:klaxon:${Versions.klaxon}"
    val jcommander = "com.beust:jcommander:${Versions.jcommander}"
    val mockwebserver = "com.squareup.okhttp3:mockwebserver:${Versions.mockwebserver}"
    val logging = "io.github.microutils:kotlin-logging:${Versions.logging}"
    val rxkotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxkotlin}"
    val kodein = "org.kodein.di:kodein-di-generic-jvm:${Versions.kodein}"
    val gson = "com.google.code.gson:gson:${Versions.gson}"
    val mockk = "io.mockk:mockk:${Versions.mockk}"
    val bouncycastle = "org.bouncycastle:bcprov-jdk15on:${Versions.bouncycastle}"
    val slf4j = "org.slf4j:slf4j-api:${Versions.slf4j}"

    object ktor {
        object client {
            val cio = "io.ktor:ktor-client-cio:$ktor"
            val jsonjvm = "io.ktor:ktor-client-json-jvm:$ktor"
            val gson = "io.ktor:ktor-client-gson:$ktor"
            val loggingjvm = "io.ktor:ktor-client-logging-jvm:$ktor"
        }
    }

    object log4j {
        val log4j2 = "org.apache.logging.log4j:log4j-core:${Versions.log4j2}"
        val log4j2slf4j = "org.apache.logging.log4j:log4j-slf4j-impl:${Versions.log4j2}"
    }

    object apache {
        object commons {
            val lang = "org.apache.commons:commons-lang3:${Versions.apache.commons.commons}"
            val io = "commons-io:commons-io:${Versions.apache.commons.io}"
        }
    }

    object retrofit {
        val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        val gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    }

    object aws {
        val s3 = "com.amazonaws:aws-java-sdk-s3:${Versions.aws}"
        val sqs = "com.amazonaws:aws-java-sdk-sqs:${Versions.aws}"
        val sns = "com.amazonaws:aws-java-sdk-sns:${Versions.aws}"
    }

    object libgdx {
        val gdx = "com.badlogicgames.gdx:gdx:${Versions.libgdx}"
        val lwjgl3 = "com.badlogicgames.gdx:gdx-backend-lwjgl3:${Versions.libgdx}"
        val nativesDesktop = "com.badlogicgames.gdx:gdx-platform:${Versions.libgdx}:natives-desktop"
        val tools = "com.badlogicgames.gdx:gdx-tools:${Versions.libgdx}"
        val headless = "com.badlogicgames.gdx:gdx-backend-headless:${Versions.libgdx}"
    }

    object libktx {
        val app = "io.github.libktx:ktx-app:${Versions.libktx}"
        val graphics = "io.github.libktx:ktx-graphics:${Versions.libktx}"
    }

    object cfg4k {
        val core = "com.jdiazcano.cfg4k:cfg4k-core:${Versions.cfg4k}"
        val bytebuddy = "com.jdiazcano.cfg4k:cfg4k-bytebuddy:${Versions.cfg4k}"
        val git = "com.jdiazcano.cfg4k:cfg4k-git:${Versions.cfg4k}"
        val hocon = "com.jdiazcano.cfg4k:cfg4k-hocon:${Versions.cfg4k}"
        val json = "com.jdiazcano.cfg4k:cfg4k-json:${Versions.cfg4k}"
        val s3 = "com.jdiazcano.cfg4k:cfg4k-s3:${Versions.cfg4k}"
        val yaml = "com.jdiazcano.cfg4k:cfg4k-yaml:${Versions.cfg4k}"
    }
}