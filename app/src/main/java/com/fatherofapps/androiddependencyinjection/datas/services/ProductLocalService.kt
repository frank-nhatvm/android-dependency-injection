package com.fatherofapps.androiddependencyinjection.datas.services

import javax.inject.Inject

class ProductLocalService @Inject constructor() {
    fun getProductDetail(): String{
        return "fake product detail data"
    }

    fun getProductList(): String{
        return "fake product list data"
    }

    fun saveProductList(data: String){

    }

    fun saveProductDetaiL(data: String){

    }

}