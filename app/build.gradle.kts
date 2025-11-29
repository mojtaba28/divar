plugins {
    id("convention.android.application")
    id("convention.android.application.compose")
//    alias(libs.plugins.android.application)
//    alias(libs.plugins.jetbrains.kotlin.android)
//    alias(libs.plugins.compose.compiler)
}

android {


    namespace = "com.divar.application"

    defaultConfig {
        applicationId = "com.divar.application"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {

    implementation(project(":data"))
    implementation(project(":domain"))
    implementation(project(":core:ui"))
    implementation(project(":core:network"))
    implementation(project(":core:secure-shared-pref"))
    implementation(project(":core:database"))
    implementation(project(":core:utils"))
}