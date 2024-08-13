package org.demo.kmm

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import org.demo.kmm.login.LoginScreen
import org.demo.kmm.main.MainScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {

        val navigationManager = remember { NavigationManager() }
        val currentScreen by navigationManager.currentScreen.collectAsState()

//        when (currentScreen) {
//            Screen.LoginScreen -> LoginScreen(navigationManager)
//            Screen.MainScreen -> MainScreen(child.component)
//        }

    }
}


