package com.fatherofapps.androiddependencyinjection.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.fatherofapps.androiddependencyinjection.datas.repositories.HomeRepository
import com.fatherofapps.androiddependencyinjection.datas.repositories.ProductRepository
import com.fatherofapps.androiddependencyinjection.ui.home.HomeViewModel

class HomeViewModelFactory constructor(
    private val homeRepository: HomeRepository,
    private val productRepository: ProductRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return HomeViewModel(homeRepository, productRepository) as T
    }
}