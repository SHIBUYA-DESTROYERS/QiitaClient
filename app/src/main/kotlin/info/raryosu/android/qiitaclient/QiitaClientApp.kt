package info.raryosu.android.qiitaclient

import android.app.Application
import info.raryosu.android.qiitaclient.dagger.AppComponent
import info.raryosu.android.qiitaclient.dagger.DaggerAppComponent

class QiitaClientApp : Application() {

    val component: AppComponent by lazy {
        DaggerAppComponent.create()
    }
}