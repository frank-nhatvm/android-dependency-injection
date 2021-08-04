package com.fatherofapps.androiddependencyinjection.datas.apis

interface ProductAPI {

    fun getProductList(): String

    fun getProductDetail(): String
}


class ProductAPIImp : ProductAPI{
    override fun getProductList(): String {
        return "product list"
    }

    override fun getProductDetail(): String {
        return "product detail"
    }
}