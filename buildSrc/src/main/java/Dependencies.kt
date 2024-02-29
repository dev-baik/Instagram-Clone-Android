package com.bjw.instagram_clone

import com.bjw.instagram_clone.Versions.HILT_VERSION
import com.bjw.instagram_clone.Versions.KOTLIN_VERSION
import com.bjw.instagram_clone.Versions.KTLINT_VERSION
import com.bjw.instagram_clone.Versions.OKHTTP_VERSION
import com.bjw.instagram_clone.Versions.RETROFIT_VERSION

object Versions {
    const val KOTLIN_VERSION = "1.8.0"
    const val KTLINT_VERSION = "12.1.0"
    const val HILT_VERSION = "2.48"
    const val RETROFIT_VERSION = "2.9.0"
    const val OKHTTP_VERSION = "4.12.0"
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

object DaggerHilt {
    const val DAGGER_HILT = "com.google.dagger:hilt-android:$HILT_VERSION"
    const val DAGGER_HILT_COMPILER = "com.google.dagger:hilt-android-compiler:$HILT_VERSION"
}

object Retrofit {
    const val RETROFIT = "com.squareup.retrofit2:retrofit:$RETROFIT_VERSION"
    const val CONVERTER_GSON = "com.squareup.retrofit2:converter-gson:$RETROFIT_VERSION"
}

object OkHttp {
    const val OKHTTP = "com.squareup.okhttp3:okhttp:$OKHTTP_VERSION"
    const val LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:$OKHTTP_VERSION"
}

object KtLint {
    const val KTLINT = "org.jlleitschuh.gradle:ktlint-gradle:$KTLINT_VERSION"
}

object Test {
    const val JUNIT = "junit:junit:4.13.2"
    const val EXT_JUNIT = "androidx.test.ext:junit:1.1.5"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:3.5.1"
}

