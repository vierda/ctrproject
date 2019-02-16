package com.ctrack.demo.tracking.location.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/ctrack/demo/tracking/location/data/MapUseCase;", "Lcom/ctrack/demo/tracking/common/util/UseCase;", "()V", "repository", "Lcom/ctrack/demo/tracking/location/data/MapRepository;", "getUserLocation", "", "userId", "", "subscriber", "Lcom/ctrack/demo/tracking/common/util/DefaultSubscriber;", "Lcom/ctrack/demo/tracking/location/data/model/MapEntity;", "app_debug"})
public final class MapUseCase extends com.ctrack.demo.tracking.common.util.UseCase {
    private com.ctrack.demo.tracking.location.data.MapRepository repository;
    
    public final void getUserLocation(int userId, @org.jetbrains.annotations.NotNull()
    com.ctrack.demo.tracking.common.util.DefaultSubscriber<com.ctrack.demo.tracking.location.data.model.MapEntity> subscriber) {
    }
    
    public MapUseCase() {
        super();
    }
}