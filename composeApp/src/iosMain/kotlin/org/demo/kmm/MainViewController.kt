package org.demo.kmm

import androidx.compose.runtime.remember
import androidx.compose.ui.window.ComposeUIViewController
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.essenty.lifecycle.LifecycleRegistry
import org.demo.kmm.root.DefaultRootComponent
import org.demo.kmm.root.RootContent

fun MainViewController() = ComposeUIViewController {
    val root = remember {
        DefaultRootComponent(DefaultComponentContext(LifecycleRegistry()))
    }
    RootContent(root)
}

