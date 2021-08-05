package com.fatherofapps.androiddependencyinjection.datas.repositories

import com.fatherofapps.androiddependencyinjection.datas.services.ProductLocalService
import com.fatherofapps.androiddependencyinjection.datas.services.ProductRemoteService
import javax.inject.Inject

class ProductRepository @Inject constructor(private val productLocalService: ProductLocalService, private val productRemoteService: ProductRemoteService) {

    fun getProductDetail(): String{
        val cacheData = productLocalService.getProductDetail()

        if(cacheData.isEmpty()){
            val data = productRemoteService.getProductDetail()
            productLocalService.saveProductDetaiL(data)
            return data
        }

        return cacheData
    }

    fun getProductList(): String{
        val cacheData = productLocalService.getProductList()

        if(cacheData.isEmpty()){
            val  data = productRemoteService.getProductList()
            productLocalService.saveProductList(data)
            return data
        }

        return cacheData
    }

}