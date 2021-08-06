package com.fatherofapps.androiddependencyinjection

import android.app.Application
import com.fatherofapps.androiddependencyinjection.di.AppContainer
import com.fatherofapps.androiddependencyinjection.di.DaggerAppComponent

class MyApplication : Application() {

    val appComponent by lazy {
        DaggerAppComponent.create()
    }

    val appContainer = AppContainer()

    override fun onCreate() {
        super.onCreate()
        appContainer.create()
    }

}

