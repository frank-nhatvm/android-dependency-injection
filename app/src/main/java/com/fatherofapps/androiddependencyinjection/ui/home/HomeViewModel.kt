package com.fatherofapps.androiddependencyinjection.ui.home

import androidx.lifecycle.ViewModel
import com.fatherofapps.androiddependencyinjection.datas.repositories.HomeRepository
import com.fatherofapps.androiddependencyinjection.datas.repositories.ProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val homeRepository: HomeRepository, private val productRepository: ProductRepository): ViewModel() {

    private var data: String = ""

    fun getHomeData():String{
        if(data.isEmpty()) {
            data = homeRepository.getHomeData()
            productRepository.getProductList()
        }
        return data
    }

}