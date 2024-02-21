buildscript {

    repositories {
        maven(url = "https://plugins.gradle.org/m2/")
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.3.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
        classpath("org.jlleitschuh.gradle:ktlint-gradle:12.1.0")
    }
}

plugins {
    id("com.android.application") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.0" apply false
    id("com.android.library") version "8.1.0" apply false
    id("org.jlleitschuh.gradle.ktlint") version "12.1.0"
}

allprojects {
    apply {
        plugin("maven-publish")
    }

    tasks.withType<JavaCompile> {
        options.isIncremental = true
    }
}
