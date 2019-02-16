package com.ctrack.demo.tracking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/ctrack/demo/tracking/TrackingApplication;", "Landroid/app/Application;", "()V", "DATABASE_NAME", "", "database", "Lcom/ctrack/demo/tracking/common/data/database/AppDatabase;", "getDatabase", "onCreate", "", "Companion", "app_debug"})
public final class TrackingApplication extends android.app.Application {
    private final java.lang.String DATABASE_NAME = "TrackingDb";
    private com.ctrack.demo.tracking.common.data.database.AppDatabase database;
    @org.jetbrains.annotations.NotNull()
    public static com.ctrack.demo.tracking.TrackingApplication _instance;
    public static final com.ctrack.demo.tracking.TrackingApplication.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ctrack.demo.tracking.common.data.database.AppDatabase getDatabase() {
        return null;
    }
    
    public TrackingApplication() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/ctrack/demo/tracking/TrackingApplication$Companion;", "", "()V", "_instance", "Lcom/ctrack/demo/tracking/TrackingApplication;", "get_instance", "()Lcom/ctrack/demo/tracking/TrackingApplication;", "set_instance", "(Lcom/ctrack/demo/tracking/TrackingApplication;)V", "getInstance", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.ctrack.demo.tracking.TrackingApplication get_instance() {
            return null;
        }
        
        public final void set_instance(@org.jetbrains.annotations.NotNull()
        com.ctrack.demo.tracking.TrackingApplication p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.ctrack.demo.tracking.TrackingApplication getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}