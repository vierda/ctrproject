package com.ctrack.demo.tracking.common.data.dao

import android.arch.persistence.room.*
import com.ctrack.demo.tracking.common.data.entity.User

@Dao
interface UserDao {

    @Query("SELECT * FROM user")
    abstract fun getAll(): List<User>

    @Query("SELECT * FROM user WHERE id BETWEEN :start AND :end")
    abstract fun loadSomeUsers(start: Int, end: Int): List<User>

    @Query("SELECT * FROM user WHERE id LIKE :userId")
    abstract fun findUserById(userId: Int): User

    @Query("SELECT COUNT(*) from user")
    abstract fun count(): Int

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insert(user: User)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insertAll(users: List<User>)

    @Delete
    abstract fun delete(user: User)
}