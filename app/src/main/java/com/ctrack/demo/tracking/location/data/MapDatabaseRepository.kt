package com.ctrack.demo.tracking.location.data

import com.ctrack.demo.tracking.TrackingApplication
import com.ctrack.demo.tracking.location.data.model.MapEntity
import io.reactivex.Observable
import java.util.concurrent.Executors

class MapDatabaseRepository {

    fun getUserLocation(userId: Int): Observable<MapEntity> {
        return Observable.unsafeCreate { it ->
            Executors.newSingleThreadExecutor().execute(Runnable {
                val user = TrackingApplication._instance.getDatabase()?.UserDao()?.findUserById(userId)
                val mapEntity = MapEntity()

                mapEntity.lat = user?.address?.geo?.lat!!.toDouble()
                mapEntity.lng = user?.address?.geo?.lng!!.toDouble()
                mapEntity.addressOne = "${user?.address?.street} ${user?.address?.suite}"
                mapEntity.addressTwo = "${user?.address?.city}, ${user?.address.zipcode}"

                it.onNext(mapEntity)
                it.onComplete()
            })
        }
    }
}