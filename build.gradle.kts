buildscript {

    dependencies {
        classpath("com.android.tools.build:gradle:7.3.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
    }
}

plugins {
    id("com.android.application") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.0" apply false
}

allprojects {
    apply {
        plugin("maven-publish")
    }

    tasks.withType<JavaCompile> {
        options.isIncremental = true
    }
}
