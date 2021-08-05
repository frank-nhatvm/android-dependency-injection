package com.fatherofapps.androiddependencyinjection.ui.product

import androidx.lifecycle.ViewModel
import com.fatherofapps.androiddependencyinjection.datas.repositories.ProductRepository

class ProductViewModel constructor(private val productRepository: ProductRepository) : ViewModel() {

    fun getProductDetail(): String{
        return productRepository.getProductDetail()
    }

}