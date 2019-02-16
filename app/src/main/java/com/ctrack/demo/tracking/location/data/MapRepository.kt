package com.ctrack.demo.tracking.location.data

import com.ctrack.demo.tracking.location.data.model.MapEntity
import io.reactivex.Observable

class MapRepository {

    private var mapDatabaseRepositoy: MapDatabaseRepository = MapDatabaseRepository()

    fun getUserLocation(userId:Int) : Observable<MapEntity> {
        return mapDatabaseRepositoy.getUserLocation(userId)
    }
}