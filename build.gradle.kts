// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version ProjectConfig.application apply false
    id("org.jetbrains.kotlin.android") version ProjectConfig.jetbrainsKotlin apply false
    id("com.android.library") version ProjectConfig.application apply false
    id("com.google.dagger.hilt.android") version ProjectConfig.hiltVersion apply false
    id("com.google.devtools.ksp") version ProjectConfig.devTools apply false
    id("io.gitlab.arturbosch.detekt") version ProjectConfig.detektVersion apply true

}