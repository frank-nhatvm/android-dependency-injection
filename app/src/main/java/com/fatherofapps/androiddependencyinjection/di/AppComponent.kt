package com.fatherofapps.androiddependencyinjection.di

import com.fatherofapps.androiddependencyinjection.ui.home.HomeFragment
import com.fatherofapps.androiddependencyinjection.ui.product.ProductFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class,ViewModelModule::class])
interface AppComponent {

    fun inject(fragment: HomeFragment)

    fun inject(fragment: ProductFragment)

}