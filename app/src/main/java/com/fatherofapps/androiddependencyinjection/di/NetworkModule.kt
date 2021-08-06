package com.fatherofapps.androiddependencyinjection.di

import com.fatherofapps.androiddependencyinjection.datas.apis.HomeAPI
import com.fatherofapps.androiddependencyinjection.datas.apis.HomeAPIImpl
import com.fatherofapps.androiddependencyinjection.datas.apis.ProductAPI
import com.fatherofapps.androiddependencyinjection.datas.apis.ProductAPIImp
import dagger.Module
import dagger.Provides

@Module
class NetworkModule {

    @Provides
    fun provideHomeAPI(): HomeAPI{
        return HomeAPIImpl()
    }

    @Provides
    fun provideProductAPI(): ProductAPI{
        return ProductAPIImp()
    }

}