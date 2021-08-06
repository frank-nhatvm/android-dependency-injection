package com.fatherofapps.androiddependencyinjection.datas.services

import com.fatherofapps.androiddependencyinjection.datas.apis.ProductAPI
import javax.inject.Inject

class ProductRemoteService @Inject constructor(private val productAPI: ProductAPI) {

    fun getProductDetail(): String{
        return productAPI.getProductDetail()
    }

    fun getProductList(): String{
        return productAPI.getProductList()
    }

}