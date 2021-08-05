package com.fatherofapps.androiddependencyinjection

import android.app.Application
import com.fatherofapps.androiddependencyinjection.di.DaggerAppComponent

class MyApplication : Application() {


    val appComponent = DaggerAppComponent.create()

}