package com.ctrack.demo.tracking.common.data.dao

import android.arch.persistence.room.*
import com.ctrack.demo.tracking.common.data.entity.Login

@Dao
interface LoginDao {

    @Query("SELECT COUNT(*) from login")
    abstract fun count(): Int

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insert(login: Login)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insertAll(logins: List<Login>)

    @Delete
    abstract fun delete(login: Login)

    @Query("SELECT * FROM login WHERE username LIKE :username AND password LIKE :password")
    abstract fun getAuthenticationUser(username: String, password: String) : Login

}