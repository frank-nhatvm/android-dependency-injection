package com.fatherofapps.androiddependencyinjection.di

import androidx.lifecycle.ViewModel
import com.fatherofapps.androiddependencyinjection.datas.apis.HomeAPIImpl
import com.fatherofapps.androiddependencyinjection.datas.apis.ProductAPIImp
import com.fatherofapps.androiddependencyinjection.datas.repositories.HomeRepository
import com.fatherofapps.androiddependencyinjection.datas.repositories.ProductRepository
import com.fatherofapps.androiddependencyinjection.datas.services.HomeLocalService
import com.fatherofapps.androiddependencyinjection.datas.services.HomeRemoteService
import com.fatherofapps.androiddependencyinjection.datas.services.ProductLocalService
import com.fatherofapps.androiddependencyinjection.datas.services.ProductRemoteService
import com.fatherofapps.androiddependencyinjection.ui.home.HomeViewModel
import com.fatherofapps.androiddependencyinjection.ui.product.ProductViewModel

class AppContainer {

    val productAPI = ProductAPIImp()
    val productRemoteService = ProductRemoteService(productAPI)
    val productLocalService = ProductLocalService()
    val productRepository = ProductRepository(productRemoteService = productRemoteService,productLocalService = productLocalService)

    val homeAPI = HomeAPIImpl()
    val homeRemoteService = HomeRemoteService(homeAPI)
    val homeLocalService = HomeLocalService()
    val homeRepository = HomeRepository(homeRemoteService,homeLocalService)


    lateinit var viewModelFactory: ViewModelFactory

    fun create(){
        val viewModelsMap = LinkedHashMap<Class<out ViewModel>, Provider<ViewModel>>()
        val homeViewModelProvider = HomeViewModelProvider(homeRepository = homeRepository,productRepository=productRepository)
        viewModelsMap.put(HomeViewModel::class.java,homeViewModelProvider)

        val productViewModelProvider = ProductViewModelProvider(productRepository)
        viewModelsMap.put(ProductViewModel::class.java,productViewModelProvider)

        viewModelFactory = ViewModelFactory(viewModelsMap)
    }

}