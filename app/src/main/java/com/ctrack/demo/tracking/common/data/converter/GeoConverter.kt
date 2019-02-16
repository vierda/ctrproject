package com.ctrack.demo.tracking.common.data.converter

import android.arch.persistence.room.TypeConverter
import com.ctrack.demo.tracking.common.data.entity.Geo
import com.ctrack.demo.tracking.common.util.Util
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class GeoConverter {

    val gson: Gson = Util.gson

    @TypeConverter
    fun getGeo(geo: String): Geo {
        val listType = object : TypeToken<Geo>() {}.type
        return gson.fromJson(geo, listType)
    }

    @TypeConverter
    fun getStringFromGeo(geo: Geo): String {
        return gson.toJson(geo)
    }
}