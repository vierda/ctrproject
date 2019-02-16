package com.ctrack.demo.tracking.common.data.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.arch.persistence.room.TypeConverters
import com.ctrack.demo.tracking.common.data.converter.AddressConverter
import com.ctrack.demo.tracking.common.data.converter.CompanyConverter


@Entity(tableName = "user")
class User {

    @PrimaryKey
    var id: Int = 0
    var name: String = ""
    var username: String = ""
    var email: String = ""

    @TypeConverters(AddressConverter::class)
    lateinit var address: Address

    var phone: String = ""
    var website: String = ""

    @TypeConverters(CompanyConverter::class)
    lateinit var company: Company
}