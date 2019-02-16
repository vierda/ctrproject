package com.ctrack.demo.tracking.location.presentation.view

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ctrack.demo.tracking.R
import com.ctrack.demo.tracking.location.data.model.MapEntity
import com.ctrack.demo.tracking.location.presentation.viewmodel.MapViewModel
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.Marker


class MapActivity : AppCompatActivity(), OnMapReadyCallback {

    companion object {
        var USER_ID = "userId"
    }

    private lateinit var mMap: GoogleMap
    private var userId: Int = 0
    private lateinit var locationLiveData: LiveData<MapEntity>
    private lateinit var locationViewModel: MapViewModel
    private var gMap: GoogleMap? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        userId = intent.getIntExtra(USER_ID, 0)
        locationViewModel = ViewModelProviders.of(this).get(MapViewModel::class.java)
        locationLiveData = locationViewModel.getLocationLiveData()
    }

    override fun onMapReady(gMap: GoogleMap?) {
        locationViewModel.getUserLocation(userId)
        this.gMap = gMap
        observe()
    }

    private fun observe() {

        locationLiveData.observe(this, Observer<MapEntity> { t ->
            val place = LatLng(t!!.lat, t!!.lng)
            gMap?.moveCamera(CameraUpdateFactory.newLatLng(place))
            gMap?.addMarker(MarkerOptions()
                    .position(place)
                    .title(t?.addressOne)
                    .snippet(t?.addressTwo))

            //16/2/2109 note : LatLng from server not set correctly, it always show somewhere in ocean
            //zoom map will be useless in this point
            //gMap?.moveCamera(CameraUpdateFactory.newLatLngZoom(myPlace, 15.0f))
        })


    }
}