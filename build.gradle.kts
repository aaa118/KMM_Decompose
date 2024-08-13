plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.jetbrainsCompose) apply false
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
//    id("kotlinx-serialization") version "1.7.1"
//    kotlin("jvm") version "2.0.0"
    alias(libs.plugins.jetbrains.kotlin.serializationGradlePlug) apply false
}