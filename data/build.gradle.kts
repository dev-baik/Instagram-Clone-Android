plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.bjw.data"
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
}
