package com.ctrack.demo.tracking.common.data.entity;

import java.lang.System;

@android.arch.persistence.room.Entity(tableName = "address")
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b\u00a8\u0006\u001e"}, d2 = {"Lcom/ctrack/demo/tracking/common/data/entity/Address;", "", "()V", "city", "", "getCity", "()Ljava/lang/String;", "setCity", "(Ljava/lang/String;)V", "geo", "Lcom/ctrack/demo/tracking/common/data/entity/Geo;", "getGeo", "()Lcom/ctrack/demo/tracking/common/data/entity/Geo;", "setGeo", "(Lcom/ctrack/demo/tracking/common/data/entity/Geo;)V", "id", "", "getId", "()I", "setId", "(I)V", "street", "getStreet", "setStreet", "suite", "getSuite", "setSuite", "zipcode", "getZipcode", "setZipcode", "app_debug"})
public final class Address {
    @android.arch.persistence.room.PrimaryKey(autoGenerate = true)
    private int id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String street;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String suite;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String city;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String zipcode;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.TypeConverters(value = {com.ctrack.demo.tracking.common.data.converter.GeoConverter.class})
    public com.ctrack.demo.tracking.common.data.entity.Geo geo;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStreet() {
        return null;
    }
    
    public final void setStreet(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSuite() {
        return null;
    }
    
    public final void setSuite(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCity() {
        return null;
    }
    
    public final void setCity(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getZipcode() {
        return null;
    }
    
    public final void setZipcode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ctrack.demo.tracking.common.data.entity.Geo getGeo() {
        return null;
    }
    
    public final void setGeo(@org.jetbrains.annotations.NotNull()
    com.ctrack.demo.tracking.common.data.entity.Geo p0) {
    }
    
    public Address() {
        super();
    }
}