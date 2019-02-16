package com.ctrack.demo.tracking.common.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u001a\u0010\r\u001a\u00020\b\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0010J)\u0010\r\u001a\u00020\b\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/ctrack/demo/tracking/common/network/VolleyHelper;", "", "()V", "REQUEST_TIMEOUT", "", "sRequestQueue", "Lcom/android/volley/RequestQueue;", "cancelAll", "", "tag", "createCustomRetryPolicy", "Lcom/android/volley/RetryPolicy;", "timeout", "exec", "T", "request", "Lcom/android/volley/Request;", "(Lcom/android/volley/Request;Ljava/lang/Integer;)V", "init", "context", "Landroid/content/Context;", "app_debug"})
public final class VolleyHelper {
    private static com.android.volley.RequestQueue sRequestQueue;
    private static final int REQUEST_TIMEOUT = 60;
    public static final com.ctrack.demo.tracking.common.network.VolleyHelper INSTANCE = null;
    
    public final void init(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final <T extends java.lang.Object>void exec(@org.jetbrains.annotations.NotNull()
    com.android.volley.Request<T> request) {
    }
    
    public final <T extends java.lang.Object>void exec(@org.jetbrains.annotations.NotNull()
    com.android.volley.Request<T> request, @org.jetbrains.annotations.Nullable()
    java.lang.Integer timeout) {
    }
    
    public final void cancelAll(@org.jetbrains.annotations.NotNull()
    java.lang.Object tag) {
    }
    
    private final com.android.volley.RetryPolicy createCustomRetryPolicy(int timeout) {
        return null;
    }
    
    private VolleyHelper() {
        super();
    }
}