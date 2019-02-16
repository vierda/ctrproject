package com.ctrack.demo.tracking.location.data

import com.ctrack.demo.tracking.common.util.DefaultSubscriber
import com.ctrack.demo.tracking.common.util.UseCase
import com.ctrack.demo.tracking.location.data.model.MapEntity

class MapUseCase : UseCase() {

    private var repository: MapRepository = MapRepository()

    fun getUserLocation(userId: Int, subscriber: DefaultSubscriber<MapEntity>) {
        execute(repository.getUserLocation(userId), subscriber)
    }
}