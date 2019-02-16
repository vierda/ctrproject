package com.ctrack.demo.tracking.common.data.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.arch.persistence.room.TypeConverters
import com.ctrack.demo.tracking.common.data.converter.GeoConverter

@Entity(tableName = "address")
class Address {

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
    var street: String = ""
    var suite: String = ""
    var city: String = ""
    var zipcode: String = ""

    @TypeConverters(GeoConverter::class)
    lateinit var geo: Geo
}