package com.ctrack.demo.tracking.common.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 0*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u00010B-\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nBO\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010BO\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u00a2\u0006\u0002\u0010\u0012J\u0015\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00028\u0000H\u0014\u00a2\u0006\u0002\u0010%J\n\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010(\u001a\u00020\u0004H\u0016J\u0014\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040 H\u0017J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000+2\u0006\u0010$\u001a\u00020\u001eH\u0014J\u000e\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020\u0004J\u001a\u0010.\u001a\u00020#2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040 R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/ctrack/demo/tracking/common/network/JsonRequest;", "T", "Lcom/android/volley/Request;", "url", "", "requestBody", "listener", "Lcom/android/volley/Response$Listener;", "errorListener", "Lcom/android/volley/Response$ErrorListener;", "(Ljava/lang/String;Ljava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V", "method", "", "pJSessionId", "type", "Ljava/lang/Class;", "(ILjava/lang/String;Ljava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;Ljava/lang/String;Ljava/lang/Class;)V", "Lcom/ctrack/demo/tracking/common/network/JsonResponseListener;", "(ILjava/lang/String;Ljava/lang/String;Lcom/ctrack/demo/tracking/common/network/JsonResponseListener;Lcom/android/volley/Response$ErrorListener;Ljava/lang/String;Ljava/lang/Class;)V", "gson", "Lcom/google/gson/Gson;", "jsonResponse", "Lcom/google/gson/JsonObject;", "mContentType", "mJSessionId", "mJsonResponseListener", "mListener", "mRequestBody", "mType", "nwResponse", "Lcom/android/volley/NetworkResponse;", "requestHeaders", "", "responseCode", "deliverResponse", "", "response", "(Ljava/lang/Object;)V", "getBody", "", "getBodyContentType", "getHeaders", "parseNetworkResponse", "Lcom/android/volley/Response;", "setBodyContentType", "pContentType", "setRequestHeaders", "headers", "Companion", "app_debug"})
public final class JsonRequest<T extends java.lang.Object> extends com.android.volley.Request<T> {
    private com.google.gson.JsonObject jsonResponse;
    private int responseCode;
    private com.android.volley.Response.Listener<T> mListener;
    private com.ctrack.demo.tracking.common.network.JsonResponseListener<T> mJsonResponseListener;
    private java.lang.String mRequestBody;
    private final java.lang.Class<T> mType = null;
    private java.lang.String mContentType;
    private java.lang.String mJSessionId;
    private java.util.Map<java.lang.String, java.lang.String> requestHeaders;
    private com.android.volley.NetworkResponse nwResponse;
    private final com.google.gson.Gson gson = null;
    private static final java.lang.String PROTOCOL_CHARSET = "utf-8";
    private static final java.lang.String PROTOCOL_CONTENT_TYPE = null;
    public static final com.ctrack.demo.tracking.common.network.JsonRequest.Companion Companion = null;
    
    /**
     * * Deliver received response to specified listener.
     *     *
     *     * @param response
     *     * T response object.
     */
    @java.lang.Override()
    protected void deliverResponse(T response) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.android.volley.Response<T> parseNetworkResponse(@org.jetbrains.annotations.NotNull()
    com.android.volley.NetworkResponse response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getBodyContentType() {
        return null;
    }
    
    public final void setBodyContentType(@org.jetbrains.annotations.NotNull()
    java.lang.String pContentType) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public byte[] getBody() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.String> getHeaders() {
        return null;
    }
    
    /**
     * * Sets map header.
     *     *
     *     * @param headers
     *     * the map header
     */
    public final void setRequestHeaders(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> headers) {
    }
    
    public JsonRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String requestBody, @org.jetbrains.annotations.NotNull()
    com.android.volley.Response.Listener<T> listener, @org.jetbrains.annotations.NotNull()
    com.android.volley.Response.ErrorListener errorListener) {
        super(null, null);
    }
    
    public JsonRequest(int method, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String requestBody, @org.jetbrains.annotations.NotNull()
    com.android.volley.Response.Listener<T> listener, @org.jetbrains.annotations.NotNull()
    com.android.volley.Response.ErrorListener errorListener, @org.jetbrains.annotations.Nullable()
    java.lang.String pJSessionId, @org.jetbrains.annotations.Nullable()
    java.lang.Class<T> type) {
        super(null, null);
    }
    
    public JsonRequest(int method, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.String requestBody, @org.jetbrains.annotations.NotNull()
    com.ctrack.demo.tracking.common.network.JsonResponseListener<T> listener, @org.jetbrains.annotations.NotNull()
    com.android.volley.Response.ErrorListener errorListener, @org.jetbrains.annotations.Nullable()
    java.lang.String pJSessionId, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> type) {
        super(null, null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/ctrack/demo/tracking/common/network/JsonRequest$Companion;", "", "()V", "PROTOCOL_CHARSET", "", "PROTOCOL_CONTENT_TYPE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}