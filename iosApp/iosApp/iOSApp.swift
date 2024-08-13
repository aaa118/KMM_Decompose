import SwiftUI
import ComposeApp

@main
struct iOSApp: App {
	var body: some Scene {
		WindowGroup {
			ContentView()
		}
	}
}
//@main
//struct iOSApp: App {
//    @UIApplicationDelegateAdaptor(AppDelegate.self)
//    var appDelegate: AppDelegate
//
//    var body: some Scene {
//        WindowGroup {
//            RootView(root: appDelegate.root)
//                .ignoresSafeArea(.all)
//        }
//    }
//}
//
//class AppDelegate: NSObject, UIApplicationDelegate {
//    let root: RootComponent = DefaultRootComponent(
//        componentContext: DefaultComponentContext(lifecycle: ApplicationLifecycle())
//    )
//}
//@main
//struct iOSApp: App {
//    @UIApplicationDelegateAdaptor(AppDelegate.self)
//    var appDelegate: AppDelegate
//
//    var body: some Scene {
//        WindowGroup {
//            RootView(root: appDelegate.root, backDispatcher: appDelegate.backDispatcher)
//                .ignoresSafeArea(.all)
//        }
//    }
//}
//
//class AppDelegate: NSObject, UIApplicationDelegate {
//    private var stateKeeper = StateKeeperDispatcherKt.StateKeeperDispatcher(savedState: nil)
//    var backDispatcher: BackDispatcher = BackDispatcherKt.BackDispatcher()
//
//    lazy var root: RootComponent = DefaultRootComponent(
//        componentContext: DefaultComponentContext(
//            lifecycle: ApplicationLifecycle(),
//            stateKeeper: stateKeeper,
//            instanceKeeper: nil,
//            backHandler: backDispatcher
//        )
//        featureInstaller: DefaultFeatureInstaller.shared,
//        deepLink: DefaultRootComponentDeepLinkNone.shared,
//        webHistoryController: nil
//    )

//    func application(_ application: UIApplication, shouldSaveSecureApplicationState coder: NSCoder) -> Bool {
//        StateKeeperUtilsKt.save(coder: coder, state: stateKeeper.save())
//        return true
//    }

//    func application(_ application: UIApplication, shouldRestoreSecureApplicationState coder: NSCoder) -> Bool {
////        stateKeeper = StateKeeperDispatcherKt.StateKeeperDispatcher(savedState: StateKeeperUtilsKt.restore(coder: coder))
//        return true
//    }
//}
