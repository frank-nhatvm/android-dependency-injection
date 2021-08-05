package com.fatherofapps.androiddependencyinjection.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.Exception
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton


@Singleton
class ViewModelFactory @Inject constructor(private val viewModelsMap: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val provider = viewModelsMap[modelClass] ?: viewModelsMap.asIterable()
            .firstOrNull { modelClass.isAssignableFrom(it.key) }?.value
        ?: throw  Exception("you have not registered ViewModel $modelClass")
        return provider.get() as T
    }

}