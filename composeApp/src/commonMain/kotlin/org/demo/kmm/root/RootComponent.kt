package org.demo.kmm.root

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.pop
import com.arkivanov.decompose.router.stack.popTo
import com.arkivanov.decompose.router.stack.pushNew
import com.arkivanov.decompose.value.Value
import com.arkivanov.essenty.backhandler.BackHandlerOwner
import kotlinx.serialization.Serializable
import org.demo.kmm.login.DefaultLoginComponent
import org.demo.kmm.login.LoginComponent
import org.demo.kmm.main.DefaultMainComponent
import org.demo.kmm.main.MainComponent

interface RootComponent : BackHandlerOwner {

    val childStack: Value<ChildStack<*, Child>>

    fun onBackClicked()
    fun onBackClicked(toIndex: Int)

    sealed class Child {
        class LoginChild(val component: LoginComponent) : Child()
        class MainChild(val component: MainComponent) : Child()
    }
}

class DefaultRootComponent(
    componentContext: ComponentContext
) : RootComponent, ComponentContext by componentContext {

    private val navigation = StackNavigation<Config>()

    override val childStack: Value<ChildStack<*, RootComponent.Child>> =
        childStack(
            source = navigation,
            serializer = Config.serializer(), // Or null to disable navigation state saving
            initialConfiguration = Config.LoginChild(),
            handleBackButton = true, // Pop the back stack on back button press
            childFactory = ::createChild,
        )
    override fun onBackClicked() {
        navigation.pop()
    }
    override fun onBackClicked(toIndex: Int) {
        navigation.popTo(index = toIndex)
    }

    private fun createChild(config: Config, componentContext: ComponentContext): RootComponent.Child =
        when (config) {
//            is Config.List -> RootComponent.Child.LoginChild(itemList(componentContext))
//            is Config.Details -> DetailsChild(itemDetails(componentContext, config))
            is Config.LoginChild -> RootComponent.Child.LoginChild(itemList(componentContext))
            is Config.MainChild -> RootComponent.Child.MainChild(itemDetails(componentContext))
        }

    private fun itemList(componentContext: ComponentContext): LoginComponent =
        DefaultLoginComponent(
            componentContext = componentContext,
            openMainScreen = { navigation.pushNew(Config.MainChild()) }
        )

    private fun itemDetails(componentContext: ComponentContext): MainComponent =
        DefaultMainComponent(
            componentContext = componentContext,
            onFinished = { navigation.pop() }
        )

    @Serializable
    private sealed class Config {
        class LoginChild() : Config()
        class MainChild(): Config()

    }
}
