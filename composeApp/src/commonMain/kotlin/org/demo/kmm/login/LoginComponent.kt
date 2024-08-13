package org.demo.kmm.login

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.value.Value
import org.demo.kmm.main.MainScreen
import org.demo.kmm.root.RootComponent

interface LoginComponent {
//    val stack: Value<ChildStack<*, LoginComponent>>

    fun onBackClicked()
}

class DefaultLoginComponent(
    private val componentContext: ComponentContext,
    private val openMainScreen: () -> Unit,
//    private val onFinished: () -> Unit
) : LoginComponent, ComponentContext by componentContext {

    // Omitted code

    override fun onBackClicked() {
        openMainScreen()
//        componentContext.chil
//       componentContext.childStack(RootComponent.Child.MainChild(componentContext))
    }
}