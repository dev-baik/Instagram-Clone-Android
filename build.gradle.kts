buildscript {

    repositories {
        maven(url = "https://plugins.gradle.org/m2/")
    }

    dependencies {
        classpath(com.bjw.instagram_clone.Android.BUILD_GRADLE)
        classpath(com.bjw.instagram_clone.Kotlin.SDK)
        classpath(com.bjw.instagram_clone.KtLint.KTLINT)
    }
}

plugins {
    id("com.android.application") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.0" apply false
    id("com.android.library") version "8.1.0" apply false
    id("com.google.dagger.hilt.android") version "2.48" apply false
    id("org.jlleitschuh.gradle.ktlint") version "12.1.0"
}

allprojects {
    apply {
        plugin("maven-publish")
    }

    tasks.withType<JavaCompile> {
        options.isIncremental = true
    }

    tasks.withType(type = org.jetbrains.kotlin.gradle.internal.KaptGenerateStubsTask::class) {
        kotlinOptions.jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}
