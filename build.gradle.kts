plugins {
    java
}

allprojects {
    version = "1.0.0"
    group = "ru.vichukano.gof"
}

subprojects {
    apply<JavaPlugin>()

    repositories {
        mavenCentral()
    }

    dependencies {
        testImplementation("org.junit.jupiter:junit-jupiter:5.10.3")
        testImplementation("com.github.stefanbirkner:system-lambda:1.0.0")
        testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    }

    java {
        toolchain {
            languageVersion = JavaLanguageVersion.of(21)
        }
    }

    tasks.named<Test>("test") {
        useJUnitPlatform()
    }

    tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
    }
}