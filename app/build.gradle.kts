plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.bjw.instagram_clone"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.bjw.instagram_clone"
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

    implementation(com.bjw.instagram_clone.KTX.CORE)
    implementation(com.bjw.instagram_clone.AndroidX.APP_COMPAT)
    implementation(com.bjw.instagram_clone.AndroidX.MATERIAL)
    implementation(com.bjw.instagram_clone.AndroidX.CONSTRAINT_LAYOUT)
    testImplementation(com.bjw.instagram_clone.Test.JUNIT)
    androidTestImplementation(com.bjw.instagram_clone.Test.EXT_JUNIT)
    androidTestImplementation(com.bjw.instagram_clone.Test.ESPRESSO_CORE)
}
