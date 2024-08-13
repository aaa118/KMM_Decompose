package org.demo.kmm.main

import com.arkivanov.decompose.ComponentContext

interface MainComponent {

    fun onBackClicked()

}

class DefaultMainComponent(
    componentContext: ComponentContext,
    private val onFinished: () -> Unit
) : MainComponent, ComponentContext by componentContext {
    // Omitted code
    // Omitted code

    override fun onBackClicked() {
        onFinished()
    }
}