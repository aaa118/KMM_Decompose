package org.demo.kmm

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.ComposeUIViewController
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.extensions.compose.stack.animation.predictiveback.PredictiveBackGestureIcon
import com.arkivanov.decompose.extensions.compose.stack.animation.predictiveback.PredictiveBackGestureOverlay
import com.arkivanov.essenty.backhandler.BackDispatcher
import com.arkivanov.essenty.lifecycle.LifecycleRegistry
import org.demo.kmm.root.DefaultRootComponent
import org.demo.kmm.root.RootComponent
import org.demo.kmm.root.RootContent
import platform.UIKit.UIViewController

//@OptIn(ExperimentalDecomposeApi::class)
//fun rootViewController(root: RootComponent, backDispatcher: BackDispatcher): UIViewController =
//    ComposeUIViewController {
//        PredictiveBackGestureOverlay(
//            backDispatcher = backDispatcher,
//            backIcon = { progress, _ ->
//                PredictiveBackGestureIcon(
//                    imageVector = Icons.Default.ArrowBack,
//                    progress = progress,
//                )
//            },
//            modifier = Modifier.fillMaxSize(),
//        ) {
//            RootContent(component = root, modifier = Modifier.fillMaxSize())
//        }
//    }

//fun rootViewController(root: RootComponent): UIViewController =
//    ComposeUIViewController {
//        RootContent(component = root, modifier = Modifier.fillMaxSize())
//    }

fun MainViewController() = ComposeUIViewController {
    val root = remember {
        DefaultRootComponent(DefaultComponentContext(LifecycleRegistry()))
    }
    RootContent(root)
}

