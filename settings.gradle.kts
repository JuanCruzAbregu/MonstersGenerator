pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }

    versionCatalogs {
        create("libs") {
            from(files("gradle/centralized.version.catalog.toml"))
        }
    }
}

rootProject.name = "Monsters Generator"
include(":app")
include(":core:ui")
include(":core:util")
include(":data:database")
include(":feature:generator")
include(":feature:monsters")
