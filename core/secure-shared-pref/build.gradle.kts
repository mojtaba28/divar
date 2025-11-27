plugins {
    id("convention.android.library")
    id("convention.android.hilt")
    id("convention.android.serialization")
}

android {
    namespace = "com.example.secure_shared_pref"

}

dependencies {
    implementation(libs.androidx.security.crypto)
}