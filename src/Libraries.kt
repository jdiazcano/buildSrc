object Libraries {
    object eclipse {
        const val jgit = "org.eclipse.jgit:org.eclipse.jgit:${Versions.jgit}"
    }

    object jetbrains {
        object kotlin {
            const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.jetbrains.kotlin}"
            const val reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.jetbrains.kotlin}"
            const val test = "org.jetbrains.kotlin:kotlin-test:${Versions.jetbrains.kotlin}"
            const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.jetbrains.coroutines}"
        }

        object spek {
            const val api = "org.jetbrains.spek:spek-api:${Versions.jetbrains.engine}"
            const val engine = "org.jetbrains.spek:spek-junit-platform-engine:${Versions.jetbrains.engine}"
        }

        object script {
            const val runtime = "org.jetbrains.kotlin:kotlin-script-runtime:${Versions.jetbrains.kotlin}"
            const val annotations = "com.github.holgerbrandl:kscript-annotations:${Versions.kscriptannotation}"
        }
    }

    object junit {
        const val api = "org.junit.jupiter:junit-jupiter-api:${Versions.junit}"
        const val engine = "org.junit.jupiter:junit-jupiter-engine:${Versions.junit}"
        const val params = "org.junit.jupiter:junit-jupiter-params:${Versions.junit}"
    }

    const val packr = "com.bladecoder.packr:packr:${Versions.packr}"
    const val expekt = "com.winterbe:expekt:${Versions.expekt}"
    const val bytebuddy = "net.bytebuddy:byte-buddy:${Versions.bytebuddy}"
    const val typesafe = "com.typesafe:config:${Versions.typesafe}"
    const val snakeyaml = "org.yaml:snakeyaml:${Versions.snakeyaml}"
    const val klaxon = "com.beust:klaxon:${Versions.klaxon}"
    const val jcommander = "com.beust:jcommander:${Versions.jcommander}"
    const val mockwebserver = "com.squareup.okhttp3:mockwebserver:${Versions.mockwebserver}"
    const val logging = "io.github.microutils:kotlin-logging:${Versions.logging}"
    const val rxkotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxkotlin}"
    const val kodein = "org.kodein.di:kodein-di-generic-jvm:${Versions.kodein}"
    const val gson = "com.google.code.gson:gson:${Versions.gson}"
    const val mockk = "io.mockk:mockk:${Versions.mockk}"
    const val bouncycastle = "org.bouncycastle:bcprov-jdk15on:${Versions.bouncycastle}"
    const val slf4j = "org.slf4j:slf4j-api:${Versions.slf4j}"
    const val visui = "com.kotcrab.vis:vis-ui:${Versions.visui}"
    const val picocli = "info.picocli:picocli:${Versions.picocli}"
    const val jtwig = "org.jtwig:jtwig-core:${Versions.jtwig}"
    const val clikt = "com.github.ajalt:clikt:${Versions.clikt}"
    const val atrium = "ch.tutteli.atrium:atrium-fluent-en_GB:${Versions.atrium}"

    object kotlintest {
        const val core = "io.kotlintest:kotlintest-runner-junit5:${Versions.kotlintest}"
        const val junitrunner = "io.kotlintest:kotlintest-runner-junit5:${Versions.kotlintest}"
    }

    object ktor {
        object client {
            const val cio = "io.ktor:ktor-client-cio:${Versions.ktor}"
            const val jsonjvm = "io.ktor:ktor-client-json-jvm:${Versions.ktor}"
            const val gson = "io.ktor:ktor-client-gson:${Versions.ktor}"
            const val loggingjvm = "io.ktor:ktor-client-logging-jvm:${Versions.ktor}"
        }
    }

    object log4j {
        const val log4j2 = "org.apache.logging.log4j:log4j-core:${Versions.log4j2}"
        const val log4j2slf4j = "org.apache.logging.log4j:log4j-slf4j-impl:${Versions.log4j2}"
    }

    object apache {
        object commons {
            const val lang = "org.apache.commons:commons-lang3:${Versions.apache.commons.commons}"
            const val io = "commons-io:commons-io:${Versions.apache.commons.io}"
        }
    }

    object retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    }

    object aws {
        const val s3 = "com.amazonaws:aws-java-sdk-s3:${Versions.aws}"
        const val sqs = "com.amazonaws:aws-java-sdk-sqs:${Versions.aws}"
        const val sns = "com.amazonaws:aws-java-sdk-sns:${Versions.aws}"
        const val dynamodb = "com.amazonaws:aws-java-sdk-dynamodb:${Versions.aws}"
        const val dynamodbLocal = "com.amazonaws:DynamoDBLocal:${Versions.aws}"
    }

    object awsv2 {
        const val s3 = "software.amazon.awssdk:ec2:${Versions.awsv2}"
        const val sqs = "software.amazon.awssdk:sqs:${Versions.awsv2}"
        const val sns = "software.amazon.awssdk:sns:${Versions.awsv2}"
        const val dynamodb = "software.amazon.awssdk:dynamodb:${Versions.awsv2}"
    }

    object libgdx {
        const val gdx = "com.badlogicgames.gdx:gdx:${Versions.libgdx}"
        const val lwjgl3 = "com.badlogicgames.gdx:gdx-backend-lwjgl3:${Versions.libgdx}"
        const val nativesDesktop = "com.badlogicgames.gdx:gdx-platform:${Versions.libgdx}:natives-desktop"
        const val tools = "com.badlogicgames.gdx:gdx-tools:${Versions.libgdx}"
        const val headless = "com.badlogicgames.gdx:gdx-backend-headless:${Versions.libgdx}"
    }

    object libktx {
        const val app = "io.github.libktx:ktx-app:${Versions.libktx}"
        const val graphics = "io.github.libktx:ktx-graphics:${Versions.libktx}"
    }

    object cfg4k {
        const val core = "com.jdiazcano.cfg4k:cfg4k-core:${Versions.cfg4k}"
        const val bytebuddy = "com.jdiazcano.cfg4k:cfg4k-bytebuddy:${Versions.cfg4k}"
        const val git = "com.jdiazcano.cfg4k:cfg4k-git:${Versions.cfg4k}"
        const val hocon = "com.jdiazcano.cfg4k:cfg4k-hocon:${Versions.cfg4k}"
        const val json = "com.jdiazcano.cfg4k:cfg4k-json:${Versions.cfg4k}"
        const val s3 = "com.jdiazcano.cfg4k:cfg4k-s3:${Versions.cfg4k}"
        const val yaml = "com.jdiazcano.cfg4k:cfg4k-yaml:${Versions.cfg4k}"
    }
}