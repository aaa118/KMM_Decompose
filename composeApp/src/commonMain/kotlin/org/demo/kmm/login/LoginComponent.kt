package org.demo.kmm.login

import com.arkivanov.decompose.ComponentContext

interface LoginComponent {
    fun onBackClicked()
}

class DefaultLoginComponent(
    private val componentContext: ComponentContext,
    private val openMainScreen: () -> Unit,
) : LoginComponent, ComponentContext by componentContext {
    override fun onBackClicked() {
        openMainScreen()
    }
}