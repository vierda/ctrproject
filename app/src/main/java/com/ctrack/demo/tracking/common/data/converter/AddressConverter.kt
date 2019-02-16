package com.ctrack.demo.tracking.common.data.converter

import android.arch.persistence.room.TypeConverter
import com.ctrack.demo.tracking.common.data.entity.Address
import com.ctrack.demo.tracking.common.util.Util
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class AddressConverter {

    val gson: Gson = Util.gson

    @TypeConverter
    fun getAddress(address: String): Address {
        val listType = object : TypeToken<Address>() {}.type
        return gson.fromJson(address, listType)
    }

    @TypeConverter
    fun getStringFromAddress(address: Address): String {
        return gson.toJson(address)
    }
}