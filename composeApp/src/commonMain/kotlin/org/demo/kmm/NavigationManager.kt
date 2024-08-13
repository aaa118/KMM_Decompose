package org.demo.kmm

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class NavigationManager {
    private val _currentScreen = MutableStateFlow<Screen>(Screen.LoginScreen)
    val currentScreen: StateFlow<Screen> = _currentScreen

    fun navigateToMainScreen() {
        _currentScreen.value = Screen.MainScreen
    }
}