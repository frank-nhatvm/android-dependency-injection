package com.fatherofapps.androiddependencyinjection.ui.home

import androidx.lifecycle.ViewModel
import com.fatherofapps.androiddependencyinjection.datas.repositories.HomeRepository
import com.fatherofapps.androiddependencyinjection.datas.repositories.ProductRepository

class HomeViewModel constructor(private val homeRepository: HomeRepository,private val productRepository: ProductRepository): ViewModel() {

    fun getHomeData():String{
        val data =  homeRepository.getHomeData()
        productRepository.getProductList()
        return data
    }

}