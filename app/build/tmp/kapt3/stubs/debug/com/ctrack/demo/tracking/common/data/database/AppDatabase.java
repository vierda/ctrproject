package com.ctrack.demo.tracking.common.data.database;

import java.lang.System;

@android.arch.persistence.room.Database(entities = {com.ctrack.demo.tracking.common.data.entity.Address.class, com.ctrack.demo.tracking.common.data.entity.Company.class, com.ctrack.demo.tracking.common.data.entity.Geo.class, com.ctrack.demo.tracking.common.data.entity.Login.class, com.ctrack.demo.tracking.common.data.entity.User.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lcom/ctrack/demo/tracking/common/data/database/AppDatabase;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "AddressDao", "Lcom/ctrack/demo/tracking/common/data/dao/AddressDao;", "CompanyDao", "Lcom/ctrack/demo/tracking/common/data/dao/CompanyDao;", "GeoDao", "Lcom/ctrack/demo/tracking/common/data/dao/GeoDao;", "LoginDao", "Lcom/ctrack/demo/tracking/common/data/dao/LoginDao;", "UserDao", "Lcom/ctrack/demo/tracking/common/data/dao/UserDao;", "app_debug"})
public abstract class AppDatabase extends android.arch.persistence.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ctrack.demo.tracking.common.data.dao.AddressDao AddressDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ctrack.demo.tracking.common.data.dao.CompanyDao CompanyDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ctrack.demo.tracking.common.data.dao.GeoDao GeoDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ctrack.demo.tracking.common.data.dao.LoginDao LoginDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ctrack.demo.tracking.common.data.dao.UserDao UserDao();
    
    public AppDatabase() {
        super();
    }
}