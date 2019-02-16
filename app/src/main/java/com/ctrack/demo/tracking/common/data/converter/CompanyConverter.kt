package com.ctrack.demo.tracking.common.data.converter

import android.arch.persistence.room.TypeConverter
import com.ctrack.demo.tracking.common.data.entity.Company
import com.ctrack.demo.tracking.common.util.Util
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class CompanyConverter {

    val gson: Gson = Util.gson

    @TypeConverter
    fun getCompany(company: String): Company {
        val listType = object : TypeToken<Company>() {}.type
        return gson.fromJson(company, listType)
    }

    @TypeConverter
    fun getStringFromGeo(company: Company): String {
        return gson.toJson(company)
    }
}