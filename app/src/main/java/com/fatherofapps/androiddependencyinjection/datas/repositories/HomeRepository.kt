package com.fatherofapps.androiddependencyinjection.datas.repositories

import com.fatherofapps.androiddependencyinjection.datas.services.HomeLocalService
import com.fatherofapps.androiddependencyinjection.datas.services.HomeRemoteService

class HomeRepository constructor(private val homeRemoteService: HomeRemoteService, private val homeLocalService: HomeLocalService) {

    fun getHomeData(): String {

        val cachedData = homeLocalService.getHomeDataFromDB()
        if(cachedData.isEmpty()){
            val data = homeRemoteService.getHomeData()
            homeLocalService.saveHomeDataToDB(data)
           return data
        }

        return cachedData
    }

}