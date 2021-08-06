package com.fatherofapps.androiddependencyinjection.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.fatherofapps.androiddependencyinjection.datas.repositories.HomeRepository
import com.fatherofapps.androiddependencyinjection.datas.repositories.ProductRepository
import com.fatherofapps.androiddependencyinjection.ui.home.HomeViewModel
import com.fatherofapps.androiddependencyinjection.ui.product.ProductViewModel
import java.lang.Exception

interface Provider<T> {
    fun get(): T
}

class HomeViewModelProvider constructor(
    private val homeRepository: HomeRepository,
    private val productRepository: ProductRepository
) : Provider<ViewModel> {
    override fun get(): ViewModel {
        return HomeViewModel(homeRepository, productRepository)
    }
}

class ProductViewModelProvider constructor(private val productRepository: ProductRepository): Provider<ViewModel>{
    override fun get(): ViewModel {
        return  ProductViewModel(productRepository = productRepository)
    }
}


class ViewModelFactory constructor(private val viewModelsMap: Map<Class<out ViewModel>, Provider<ViewModel>>) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val provider = viewModelsMap[modelClass] ?: viewModelsMap.asIterable()
            .firstOrNull { modelClass.isAssignableFrom(it.key) }?.value
        ?: throw  Exception("you have not registered ViewModel $modelClass")
        return provider.get() as T
    }

}