package com.ctrack.demo.tracking.location.presentation.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/ctrack/demo/tracking/location/presentation/viewmodel/MapViewModel;", "Landroid/arch/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "TAG", "", "kotlin.jvm.PlatformType", "locationLiveData", "Landroid/arch/lifecycle/MutableLiveData;", "Lcom/ctrack/demo/tracking/location/data/model/MapEntity;", "useCase", "Lcom/ctrack/demo/tracking/location/data/MapUseCase;", "getLocationLiveData", "getUserLocation", "", "userId", "", "app_debug"})
public final class MapViewModel extends android.arch.lifecycle.AndroidViewModel {
    private java.lang.String TAG;
    private com.ctrack.demo.tracking.location.data.MapUseCase useCase;
    private android.arch.lifecycle.MutableLiveData<com.ctrack.demo.tracking.location.data.model.MapEntity> locationLiveData;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<com.ctrack.demo.tracking.location.data.model.MapEntity> getLocationLiveData() {
        return null;
    }
    
    public final void getUserLocation(int userId) {
    }
    
    public MapViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}