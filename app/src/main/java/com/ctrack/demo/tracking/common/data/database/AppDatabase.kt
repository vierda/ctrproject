package com.ctrack.demo.tracking.common.data.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.ctrack.demo.tracking.common.data.dao.*
import com.ctrack.demo.tracking.common.data.entity.*

@Database(entities = [Address::class, Company::class,
    Geo::class, Login::class, User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun AddressDao(): AddressDao
    abstract fun CompanyDao(): CompanyDao
    abstract fun GeoDao(): GeoDao
    abstract fun LoginDao(): LoginDao
    abstract fun UserDao(): UserDao
}
