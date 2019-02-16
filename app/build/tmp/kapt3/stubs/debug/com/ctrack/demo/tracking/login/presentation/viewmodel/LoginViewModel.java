package com.ctrack.demo.tracking.login.presentation.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0006\u0010\u0012\u001a\u00020\u000eR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/ctrack/demo/tracking/login/presentation/viewmodel/LoginViewModel;", "Landroid/arch/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "TAG", "", "kotlin.jvm.PlatformType", "loginLiveData", "Landroid/arch/lifecycle/MutableLiveData;", "", "useCase", "Lcom/ctrack/demo/tracking/login/data/LoginUseCase;", "getAuthenticatedUser", "", "username", "password", "getLoginLiveData", "populateData", "app_debug"})
public final class LoginViewModel extends android.arch.lifecycle.AndroidViewModel {
    private java.lang.String TAG;
    private com.ctrack.demo.tracking.login.data.LoginUseCase useCase;
    private android.arch.lifecycle.MutableLiveData<java.lang.Boolean> loginLiveData;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getLoginLiveData() {
        return null;
    }
    
    public final void populateData() {
    }
    
    public final void getAuthenticatedUser(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}