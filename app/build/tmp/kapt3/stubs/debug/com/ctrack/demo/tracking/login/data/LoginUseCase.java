package com.ctrack.demo.tracking.login.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0014\u0010\r\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/ctrack/demo/tracking/login/data/LoginUseCase;", "Lcom/ctrack/demo/tracking/common/util/UseCase;", "()V", "repository", "Lcom/ctrack/demo/tracking/login/data/LoginRepository;", "getAuthenticatedUser", "", "username", "", "password", "subscriber", "Lcom/ctrack/demo/tracking/common/util/DefaultSubscriber;", "", "populateData", "app_debug"})
public final class LoginUseCase extends com.ctrack.demo.tracking.common.util.UseCase {
    private com.ctrack.demo.tracking.login.data.LoginRepository repository;
    
    public final void populateData(@org.jetbrains.annotations.NotNull()
    com.ctrack.demo.tracking.common.util.DefaultSubscriber<java.lang.Boolean> subscriber) {
    }
    
    public final void getAuthenticatedUser(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    com.ctrack.demo.tracking.common.util.DefaultSubscriber<java.lang.Boolean> subscriber) {
    }
    
    public LoginUseCase() {
        super();
    }
}