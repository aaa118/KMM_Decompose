package org.demo.kmm

sealed class Screen {
    data object LoginScreen : Screen()
    data object MainScreen : Screen()
}