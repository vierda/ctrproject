package com.ctrack.demo.tracking.user.presentation.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fJ\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/ctrack/demo/tracking/user/presentation/viewmodel/UserViewModel;", "Landroid/arch/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "TAG", "", "kotlin.jvm.PlatformType", "dataView", "Lcom/ctrack/demo/tracking/user/presentation/view/UserDataView;", "loadSomeUserLiveData", "Landroid/arch/lifecycle/MutableLiveData;", "", "Lcom/ctrack/demo/tracking/user/data/model/UserEntity;", "loadUserLiveData", "", "useCase", "Lcom/ctrack/demo/tracking/user/data/UserUseCase;", "getLoadSomeUserLiveData", "getLoadUserLiveData", "loadDataFromNetwork", "", "loadSomeData", "start", "end", "setUserDataView", "app_debug"})
public final class UserViewModel extends android.arch.lifecycle.AndroidViewModel {
    private java.lang.String TAG;
    private com.ctrack.demo.tracking.user.data.UserUseCase useCase;
    private android.arch.lifecycle.MutableLiveData<java.lang.Integer> loadUserLiveData;
    private android.arch.lifecycle.MutableLiveData<java.util.List<com.ctrack.demo.tracking.user.data.model.UserEntity>> loadSomeUserLiveData;
    private com.ctrack.demo.tracking.user.presentation.view.UserDataView dataView;
    
    public final void setUserDataView(@org.jetbrains.annotations.NotNull()
    com.ctrack.demo.tracking.user.presentation.view.UserDataView dataView) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Integer> getLoadUserLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.util.List<com.ctrack.demo.tracking.user.data.model.UserEntity>> getLoadSomeUserLiveData() {
        return null;
    }
    
    public final void loadDataFromNetwork() {
    }
    
    public final void loadSomeData(int start, int end) {
    }
    
    public UserViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}