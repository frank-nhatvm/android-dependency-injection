package com.fatherofapps.androiddependencyinjection

import android.app.Application
import com.fatherofapps.androiddependencyinjection.di.AppContainer

class MyApplication : Application() {

    val appContainer = AppContainer()

}