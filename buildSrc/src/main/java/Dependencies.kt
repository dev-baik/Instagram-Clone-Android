package com.bjw.instagram_clone

import com.bjw.instagram_clone.Versions.KOTLIN_VERSION
import com.bjw.instagram_clone.Versions.KTLINT_VERSION

object Versions {
    const val KOTLIN_VERSION = "1.8.0"
    const val KTLINT_VERSION = "12.1.0"
}

object Android {
    const val BUILD_GRADLE = "com.android.tools.build:gradle:7.3.1"
}

object Kotlin {
    const val SDK = "org.jetbrains.kotlin:kotlin-gradle-plugin:$KOTLIN_VERSION"
}

object KTX {
    const val CORE = "androidx.core:core-ktx:1.9.0"
}

object AndroidX {
    const val APP_COMPAT = "androidx.appcompat:appcompat:1.6.1"
    const val MATERIAL = "com.google.android.material:material:1.11.0"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.1.4"
}

object KtLint {
    const val KTLINT = "org.jlleitschuh.gradle:ktlint-gradle:$KTLINT_VERSION"
}

object Test {
    const val JUNIT = "junit:junit:4.13.2"
    const val EXT_JUNIT = "androidx.test.ext:junit:1.1.5"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:3.5.1"
}

