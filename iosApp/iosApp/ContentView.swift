import UIKit
import SwiftUI
import ComposeApp

struct ComposeView: UIViewControllerRepresentable {
    func makeUIViewController(context: Context) -> UIViewController {
        MainViewControllerKt.MainViewController()
    }

    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {}
}

struct ContentView: View {
    var body: some View {
        ComposeView()
                .ignoresSafeArea(.keyboard) // Compose has own keyboard handler
    }
}
//struct RootView: UIViewControllerRepresentable {
//    let root: RootComponent
//
//    func makeUIViewController(context: Context) -> UIViewController {
//        let controller = RootViewControllerKt.rootViewController(root: root)
//        controller.overrideUserInterfaceStyle = .light
//        return controller
//    }
//
//    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {
//    }
//}
//struct RootView: UIViewControllerRepresentable {
//    let root: RootComponent
//    let backDispatcher: BackDispatcher
//
//    func makeUIViewController(context: Context , backDispatcher: BackDispatcher) -> UIViewController {
//        return RootViewControllerKt.rootViewController(root: root, backDispatcher: backDispatcher)
//    }
//
//    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {
//    }
//}




