package com.ctrack.demo.tracking.common.data.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity(tableName = "login")
class Login {

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
    var username: String = ""
    var password: String = ""
}