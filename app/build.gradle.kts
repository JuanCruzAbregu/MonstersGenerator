plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.dagger.hilt.android")
    id("io.gitlab.arturbosch.detekt")
    id("com.google.devtools.ksp")
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

detekt {
    toolVersion = ProjectConfig.detektVersion
    config.setFrom(file("$rootDir/config/detekt/detekt.yml"))
}

android {
    namespace = "com.abregujuancruz.monstersgenerator"
    compileSdk = ProjectConfig.compileSdk

    defaultConfig {
        applicationId = "com.abregujuancruz.monstersgenerator"
        minSdk = ProjectConfig.minSdk
        targetSdk = ProjectConfig.targetSdk
        versionCode = ProjectConfig.codeVersion
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
    }
    kotlin {
        jvmToolchain(ProjectConfig.jdkVersion)
    }
    kapt {
        correctErrorTypes = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = ProjectConfig.jvmTarget
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = ProjectConfig.kotlinCompiler
    }
    packaging {
        resources.excludes.add("META-INF/gradle/incremental.annotation.processors")
    }
}

dependencies {

    // Hilt
    implementation(libs.dagger.hilt)
    kapt(libs.hilt.compiler)
    // Core
    implementation(libs.lifecycle.runtime)
    implementation(libs.core.ktx)
    //Compose
    implementation(libs.activity.compose)
    implementation(libs.nav.compose)
    implementation(platform(libs.compose.bom))
    //Modules
    implementation(project(":core:ui"))
    implementation(project(":core:util"))
    implementation(project(":data:database"))
    implementation(project(":feature:generator"))
    implementation(project(":feature:monsters"))

}