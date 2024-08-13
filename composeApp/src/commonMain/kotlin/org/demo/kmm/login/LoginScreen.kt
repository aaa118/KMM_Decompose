package org.demo.kmm.login

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun LoginScreen(loginComponent: LoginComponent) {

    var showContent by remember { mutableStateOf(false) }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }


    Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        TextField(
            value = email,
            onValueChange = { newText -> email = newText },
            label = { Text("Enter text") },
            modifier = Modifier.padding(16.dp)
        )
        TextField(
            value = password,
            onValueChange = { newText -> password = newText },
            label = { Text("Enter text") },
            modifier = Modifier.padding(16.dp)
        )
        Button(onClick = { loginComponent.onBackClicked() }) {
            Text("Login")
        }
    }
    AnimatedVisibility(showContent) {
        loginComponent.onBackClicked()
//        navigationManager.navigateToMainScreen()
//        MainScreen()
    }

}