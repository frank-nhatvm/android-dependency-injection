package com.fatherofapps.androiddependencyinjection.datas.services

import com.fatherofapps.androiddependencyinjection.datas.apis.ProductAPI

class ProductRemoteService constructor(private val productAPI: ProductAPI) {

    fun getProductDetail(): String{
        return productAPI.getProductDetail()
    }

    fun getProductList(): String{
        return productAPI.getProductList()
    }

}