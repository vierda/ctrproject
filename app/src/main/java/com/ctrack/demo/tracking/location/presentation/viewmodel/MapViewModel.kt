package com.ctrack.demo.tracking.location.presentation.viewmodel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.MutableLiveData
import com.ctrack.demo.tracking.location.data.MapUseCase
import com.ctrack.demo.tracking.location.data.model.MapEntity
import com.ctrack.demo.tracking.common.util.DefaultSubscriber

class MapViewModel(application: Application) : AndroidViewModel(application) {

    private var TAG = MapViewModel::class.java.simpleName
    private var useCase: MapUseCase = MapUseCase()
    private var locationLiveData: MutableLiveData<MapEntity> = MutableLiveData()

    fun getLocationLiveData(): MutableLiveData<MapEntity> {
        return locationLiveData
    }

    fun getUserLocation(userId: Int) {
        useCase.getUserLocation(userId, object : DefaultSubscriber<MapEntity>() {

            override fun onNext(t: MapEntity) {
                locationLiveData.postValue(t)
            }

        })
    }
}