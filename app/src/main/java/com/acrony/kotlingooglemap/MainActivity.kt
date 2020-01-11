package com.acrony.kotlingooglemap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MainActivity : AppCompatActivity() {
    lateinit var mapFragment: SupportMapFragment

    lateinit var googleMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment

        mapFragment.getMapAsync(OnMapReadyCallback {

            googleMap=it

            val loc= LatLng(17.448205,78.5005303)

            googleMap.addMarker(MarkerOptions().position(loc).title("ADS Softek"))

            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(loc,14f))

            val loc2= LatLng(17.448605,78.4989063)
            googleMap.addMarker(MarkerOptions().position(loc2).title("Location 2"))

            val loc3= LatLng(17.449005,78.4991063)
            googleMap.addMarker(MarkerOptions().position(loc3).title(" Location 3"))


        })


    }
}
