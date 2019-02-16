package com.ctrack.demo.tracking.common.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J;\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH&\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/ctrack/demo/tracking/common/network/JsonResponseListener;", "T", "", "onResponse", "", "response", "pJsonObject", "Lcom/google/gson/JsonObject;", "responseCode", "", "responseHeaders", "", "", "(Ljava/lang/Object;Lcom/google/gson/JsonObject;ILjava/util/Map;)V", "app_debug"})
public abstract interface JsonResponseListener<T extends java.lang.Object> {
    
    public abstract void onResponse(T response, @org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject pJsonObject, int responseCode, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> responseHeaders);
}