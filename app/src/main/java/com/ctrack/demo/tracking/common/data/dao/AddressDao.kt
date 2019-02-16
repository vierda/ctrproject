package com.ctrack.demo.tracking.common.data.dao

import android.arch.persistence.room.*
import com.ctrack.demo.tracking.common.data.entity.Address

@Dao
interface AddressDao {

    @Query("SELECT COUNT(*) from address")
    abstract fun count(): Int

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insert(address: Address)

    @Delete
    abstract fun delete(address: Address)
}