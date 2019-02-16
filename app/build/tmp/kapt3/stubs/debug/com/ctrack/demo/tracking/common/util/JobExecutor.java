package com.ctrack.demo.tracking.common.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/ctrack/demo/tracking/common/util/JobExecutor;", "Ljava/util/concurrent/Executor;", "()V", "INITIAL_POOL_SIZE", "", "KEEP_ALIVE_TIME", "KEEP_ALIVE_TIME_UNIT", "Ljava/util/concurrent/TimeUnit;", "MAX_POOL_SIZE", "threadFactory", "Ljava/util/concurrent/ThreadFactory;", "threadPoolExecutor", "Ljava/util/concurrent/ThreadPoolExecutor;", "workQueue", "Ljava/util/concurrent/BlockingQueue;", "Ljava/lang/Runnable;", "execute", "", "runnable", "JobThreadFactory", "app_debug"})
public final class JobExecutor implements java.util.concurrent.Executor {
    private final int INITIAL_POOL_SIZE = 3;
    private final int MAX_POOL_SIZE = 10;
    private final int KEEP_ALIVE_TIME = 10;
    private final java.util.concurrent.TimeUnit KEEP_ALIVE_TIME_UNIT = null;
    private java.util.concurrent.BlockingQueue<java.lang.Runnable> workQueue;
    private java.util.concurrent.ThreadPoolExecutor threadPoolExecutor;
    private java.util.concurrent.ThreadFactory threadFactory;
    
    @java.lang.Override()
    public void execute(@org.jetbrains.annotations.Nullable()
    java.lang.Runnable runnable) {
    }
    
    public JobExecutor() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/ctrack/demo/tracking/common/util/JobExecutor$JobThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "()V", "counter", "", "newThread", "Ljava/lang/Thread;", "runnable", "Ljava/lang/Runnable;", "Companion", "app_debug"})
    static final class JobThreadFactory implements java.util.concurrent.ThreadFactory {
        private final int counter = 0;
        private static final java.lang.String THREAD_NAME = "android_";
        public static final com.ctrack.demo.tracking.common.util.JobExecutor.JobThreadFactory.Companion Companion = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.Thread newThread(@org.jetbrains.annotations.NotNull()
        java.lang.Runnable runnable) {
            return null;
        }
        
        public JobThreadFactory() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/ctrack/demo/tracking/common/util/JobExecutor$JobThreadFactory$Companion;", "", "()V", "THREAD_NAME", "", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
}