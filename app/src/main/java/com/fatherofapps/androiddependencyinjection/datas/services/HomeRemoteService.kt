package com.fatherofapps.androiddependencyinjection.datas.services

import com.fatherofapps.androiddependencyinjection.datas.apis.HomeAPI
import javax.inject.Inject

class HomeRemoteService @Inject constructor(private val homeAPI: HomeAPI) {

    fun getHomeData(): String {
        return homeAPI.getHomeData()
    }

}