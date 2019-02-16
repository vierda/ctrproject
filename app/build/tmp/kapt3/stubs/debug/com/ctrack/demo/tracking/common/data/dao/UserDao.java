package com.ctrack.demo.tracking.common.data.dao;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\'J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0016\u0010\r\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\'J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\'\u00a8\u0006\u0012"}, d2 = {"Lcom/ctrack/demo/tracking/common/data/dao/UserDao;", "", "count", "", "delete", "", "user", "Lcom/ctrack/demo/tracking/common/data/entity/User;", "findUserById", "userId", "getAll", "", "insert", "insertAll", "users", "loadSomeUsers", "start", "end", "app_debug"})
public abstract interface UserDao {
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM user")
    public abstract java.util.List<com.ctrack.demo.tracking.common.data.entity.User> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM user WHERE id BETWEEN :start AND :end")
    public abstract java.util.List<com.ctrack.demo.tracking.common.data.entity.User> loadSomeUsers(int start, int end);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM user WHERE id LIKE :userId")
    public abstract com.ctrack.demo.tracking.common.data.entity.User findUserById(int userId);
    
    @android.arch.persistence.room.Query(value = "SELECT COUNT(*) from user")
    public abstract int count();
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.ctrack.demo.tracking.common.data.entity.User user);
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ctrack.demo.tracking.common.data.entity.User> users);
    
    @android.arch.persistence.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.ctrack.demo.tracking.common.data.entity.User user);
}