package com.fatherofapps.androiddependencyinjection.datas.apis

interface HomeAPI {
    fun getHomeData(): String
}

class HomeAPIImpl : HomeAPI{
    override fun getHomeData(): String {
        return "list banner and list product's id"
    }
}