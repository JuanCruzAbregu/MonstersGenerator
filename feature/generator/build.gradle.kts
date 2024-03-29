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

detekt {
    toolVersion = ProjectConfig.detektVersion
    config.setFrom(file("$rootDir/config/detekt/detekt.yml"))
}
android {
    namespace = "com.abregujuancruz.home"
    compileSdk = ProjectConfig.compileSdk

    defaultConfig {
        minSdk = ProjectConfig.minSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = ProjectConfig.kotlinCompiler
    }
    kotlinOptions {
        jvmTarget = ProjectConfig.jvmTarget
    }
    packaging {
        resources.excludes.add("META-INF/gradle/incremental.annotation.processors")
    }
}

dependencies {
    // Dagger + Hilt
    implementation(libs.dagger.hilt)
    implementation(libs.hilt.nav.compose)
    kapt(libs.hilt.compiler)
    // Core
    implementation(libs.core.ktx)
    implementation(libs.gson)
    implementation(libs.lifecycle.runtime)
    //Compose
    implementation(libs.activity.compose)
    implementation(libs.nav.compose)
    implementation(platform(libs.compose.bom))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")

    //Modules
    implementation(project(":core:ui"))
    implementation(project(":core:util"))
    implementation(project(":data:generator-data"))
}