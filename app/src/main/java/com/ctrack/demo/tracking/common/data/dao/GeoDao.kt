package com.ctrack.demo.tracking.common.data.dao

import android.arch.persistence.room.*
import com.ctrack.demo.tracking.common.data.entity.Geo

@Dao
interface GeoDao {

    @Query("SELECT COUNT(*) from geo")
    abstract fun count(): Int

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insert(geo: Geo)

    @Delete
    abstract fun delete(geo: Geo)
}