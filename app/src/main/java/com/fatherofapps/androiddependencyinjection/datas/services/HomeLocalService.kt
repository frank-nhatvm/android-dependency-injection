package com.fatherofapps.androiddependencyinjection.datas.services

class HomeLocalService {

    private var data: String = ""

    fun saveHomeDataToDB(data: String) {
        this.data = data
    }

    fun getHomeDataFromDB(): String {
        return  if(data.isNotEmpty()) "$data - from DB" else ""
    }

}