package com.fatherofapps.androiddependencyinjection.di

import com.fatherofapps.androiddependencyinjection.datas.apis.HomeAPIImpl
import com.fatherofapps.androiddependencyinjection.datas.apis.ProductAPIImp
import com.fatherofapps.androiddependencyinjection.datas.repositories.HomeRepository
import com.fatherofapps.androiddependencyinjection.datas.repositories.ProductRepository
import com.fatherofapps.androiddependencyinjection.datas.services.HomeLocalService
import com.fatherofapps.androiddependencyinjection.datas.services.HomeRemoteService
import com.fatherofapps.androiddependencyinjection.datas.services.ProductLocalService
import com.fatherofapps.androiddependencyinjection.datas.services.ProductRemoteService

class AppContainer {

    val productAPI = ProductAPIImp()
    val productRemoteService = ProductRemoteService(productAPI)
    val productLocalService = ProductLocalService()
    val productRepository = ProductRepository(productRemoteService = productRemoteService,productLocalService = productLocalService)

    val homeAPI = HomeAPIImpl()
    val homeRemoteService = HomeRemoteService(homeAPI)
    val homeLocalService = HomeLocalService()
    val homeRepository = HomeRepository(homeRemoteService,homeLocalService)

    val homeViewModelFactory = HomeViewModelFactory(homeRepository = homeRepository,productRepository=productRepository)
}