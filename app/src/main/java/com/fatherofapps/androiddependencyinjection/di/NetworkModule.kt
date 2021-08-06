package com.fatherofapps.androiddependencyinjection.di

import com.fatherofapps.androiddependencyinjection.datas.apis.HomeAPI
import com.fatherofapps.androiddependencyinjection.datas.apis.HomeAPIImpl
import com.fatherofapps.androiddependencyinjection.datas.apis.ProductAPI
import com.fatherofapps.androiddependencyinjection.datas.apis.ProductAPIImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    fun provideHomeAPI(): HomeAPI{
        return HomeAPIImpl()
    }

    @Provides
    fun provideProductAPI(): ProductAPI{
        return ProductAPIImp()
    }

}