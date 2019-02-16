package com.ctrack.demo.tracking.common.data.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity(tableName = "company")
class Company {

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
    var name: String = ""
    var catchPhrase: String = ""
    var bs: String = ""
}