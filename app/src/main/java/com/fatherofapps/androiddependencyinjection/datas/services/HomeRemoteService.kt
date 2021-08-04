package com.fatherofapps.androiddependencyinjection.datas.services

import com.fatherofapps.androiddependencyinjection.datas.apis.HomeAPI

class HomeRemoteService constructor(private val homeAPI: HomeAPI) {

    fun getHomeData(): String {
        return homeAPI.getHomeData()
    }

}