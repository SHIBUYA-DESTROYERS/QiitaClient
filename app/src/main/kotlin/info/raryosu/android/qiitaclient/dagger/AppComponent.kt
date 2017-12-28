package info.raryosu.android.qiitaclient.dagger

import dagger.Component
import info.raryosu.android.qiitaclient.MainActivity
import javax.inject.Singleton

@Component(modules = arrayOf(ClientModule::class))
@Singleton
interface AppComponent {

    fun inject(mainActivity: MainActivity)
}