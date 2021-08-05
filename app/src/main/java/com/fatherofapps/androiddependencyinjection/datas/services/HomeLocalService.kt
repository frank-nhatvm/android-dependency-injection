package com.fatherofapps.androiddependencyinjection.datas.services

import javax.inject.Inject

class HomeLocalService @Inject constructor() {

    private var data: String = ""

    fun saveHomeDataToDB(data: String) {
        this.data = data
    }

    fun getHomeDataFromDB(): String {
        return  if(data.isNotEmpty()) "$data - from DB" else ""
    }

}