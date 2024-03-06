plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.bjw.instagram_clone.app"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.bjw.instagram_clone.app"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(project(mapOf("path" to ":data")))
    implementation(project(mapOf("path" to ":domain")))

    implementation(com.bjw.instagram_clone.KTX.CORE)
    implementation(com.bjw.instagram_clone.AndroidX.APP_COMPAT)
    implementation(com.bjw.instagram_clone.AndroidX.MATERIAL)
    implementation(com.bjw.instagram_clone.AndroidX.CONSTRAINT_LAYOUT)
    testImplementation(com.bjw.instagram_clone.Test.JUNIT)
    androidTestImplementation(com.bjw.instagram_clone.Test.EXT_JUNIT)
    androidTestImplementation(com.bjw.instagram_clone.Test.ESPRESSO_CORE)

    // Retrofit
    implementation(com.bjw.instagram_clone.Retrofit.RETROFIT)
    implementation(com.bjw.instagram_clone.Retrofit.CONVERTER_GSON)

    // Hilt
    implementation(com.bjw.instagram_clone.DaggerHilt.DAGGER_HILT)
    kapt(com.bjw.instagram_clone.DaggerHilt.DAGGER_HILT_COMPILER)

    // AndroidX
    implementation(com.bjw.instagram_clone.AndroidX.LIFECYCLE_VIEW_MODEL)
    implementation(com.bjw.instagram_clone.AndroidX.LIFECYCLE_LIVEDATA)
    implementation(com.bjw.instagram_clone.AndroidX.ACTIVITY)
    implementation(com.bjw.instagram_clone.AndroidX.FRAGMENT)

    // Coroutines
    implementation(com.bjw.instagram_clone.Coroutines.COROUTINES)
}

kapt {
    correctErrorTypes = true
}
