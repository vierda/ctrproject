package com.ctrack.demo.tracking.common.data.dao

import android.arch.persistence.room.*
import com.ctrack.demo.tracking.common.data.entity.Company

@Dao
interface CompanyDao {

    @Query("SELECT COUNT(*) from company")
    abstract fun count(): Int

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insert(company: Company)

    @Delete
    abstract fun delete(company: Company)
}