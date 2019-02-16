package com.ctrack.demo.tracking

import android.app.Application
import android.arch.persistence.db.SupportSQLiteDatabase
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import com.ctrack.demo.tracking.common.data.database.AppDatabase
import com.ctrack.demo.tracking.common.data.entity.Login
import java.util.concurrent.Executors


class TrackingApplication : Application() {

    companion object {

        lateinit var _instance: TrackingApplication

        fun getInstance(): TrackingApplication {
            return _instance
        }
    }

    private val DATABASE_NAME = "TrackingDb"
    private var database: AppDatabase? = null


    override fun onCreate() {
        super.onCreate()
        _instance = this

        database = Room.databaseBuilder(applicationContext, AppDatabase::class.java!!, DATABASE_NAME)
                .build()
    }

    fun getDatabase(): AppDatabase? {
        return database
    }

}