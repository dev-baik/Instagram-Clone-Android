plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.bjw.instagram_clone.data"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
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

    implementation(com.bjw.instagram_clone.KTX.CORE)
    implementation(com.bjw.instagram_clone.AndroidX.APP_COMPAT)
    implementation(com.bjw.instagram_clone.AndroidX.MATERIAL)
    testImplementation(com.bjw.instagram_clone.Test.JUNIT)
    androidTestImplementation(com.bjw.instagram_clone.Test.EXT_JUNIT)
    androidTestImplementation(com.bjw.instagram_clone.Test.ESPRESSO_CORE)

    // Retrofit
    implementation(com.bjw.instagram_clone.Retrofit.RETROFIT)
    implementation(com.bjw.instagram_clone.Retrofit.CONVERTER_GSON)

    // Hilt
    implementation(com.bjw.instagram_clone.DaggerHilt.DAGGER_HILT)
    kapt(com.bjw.instagram_clone.DaggerHilt.DAGGER_HILT_COMPILER)
}

kapt {
    correctErrorTypes = true
}
