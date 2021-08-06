package com.fatherofapps.androiddependencyinjection.ui.product

import androidx.lifecycle.ViewModel
import com.fatherofapps.androiddependencyinjection.datas.repositories.ProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProductViewModel @Inject constructor(private val productRepository: ProductRepository) : ViewModel() {

    fun getProductDetail(): String{
        return productRepository.getProductDetail()
    }

}