package com.ctrack.demo.tracking.common.data.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity(tableName = "geo")
class Geo {

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
    var lat : String = ""
    var lng : String = ""
}