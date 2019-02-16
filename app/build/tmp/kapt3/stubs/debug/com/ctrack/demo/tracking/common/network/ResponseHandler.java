package com.ctrack.demo.tracking.common.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/ctrack/demo/tracking/common/network/ResponseHandler;", "T", "", "onReceive", "", "response", "Lcom/ctrack/demo/tracking/common/network/Response;", "app_debug"})
public abstract interface ResponseHandler<T extends java.lang.Object> {
    
    public abstract void onReceive(@org.jetbrains.annotations.NotNull()
    com.ctrack.demo.tracking.common.network.Response<T> response);
}