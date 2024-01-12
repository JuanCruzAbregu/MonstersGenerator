plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("io.gitlab.arturbosch.detekt")
    id("kotlin-parcelize")
    kotlin("kapt")

}
buildscript {
    repositories {
        gradlePluginPortal()
    }
    dependencies {
        classpath("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:${ProjectConfig.detektVersion}")
    }
}

android {
    namespace = "com.example.monsters_data"
    compileSdk = ProjectConfig.compileSdk

    defaultConfig {
        minSdk = ProjectConfig.minSdk

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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlin {
        jvmToolchain(ProjectConfig.jdkVersion)
    }
    kapt {
        correctErrorTypes = true
    }

    kotlinOptions {
        jvmTarget = ProjectConfig.jvmTarget
    }
    packaging {
        resources.excludes.add("META-INF/gradle/incremental.annotation.processors")
    }
}

dependencies {
    //Core
    implementation(libs.gson)
    implementation(libs.core.ktx)

    //Dagger + Hilt
    implementation(libs.dagger.hilt)
    implementation(libs.hilt.compiler)
    kapt(libs.hilt.compiler)

    //Retrofit
    implementation(libs.retrofit2)
    implementation(libs.retrofit2.gson)

    //Modules
    implementation(project(":core:util"))
}