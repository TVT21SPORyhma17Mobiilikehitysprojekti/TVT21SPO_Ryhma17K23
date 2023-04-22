package com.example.elainhelp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsMarkerActivity : AppCompatActivity(), OnMapReadyCallback {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Retrieve the content view that renders the map.
        setContentView(R.layout.activity_map)

        // Get the SupportMapFragment and request notification when the map is ready to be used.
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as? SupportMapFragment
        mapFragment?.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        val LEMMIKKI = LatLng(65.05933, 25.45321)
        val MERIKOSKI = LatLng(65.02240, 25.46909)
        val KAMU = LatLng(65.00765, 25.47199)
        val SUN = LatLng(65.04419, 25.58391)
        val LEENA = LatLng(65.01873, 25.54382)
        val EVI = LatLng(64.95226, 25.51013)
        val OULUN = LatLng(64.95785, 25.52870)
        val NEMO = LatLng(64.91240, 25.50613)
        val SEUDUN = LatLng(64.99606, 25.47951)
        val HERTTAINEN = LatLng(65.17713, 25.35257)

        googleMap.addMarker(
            MarkerOptions()
                .position(LEMMIKKI)
                .title("Eläinlääkariasema Lemmikki Oy, " +
                        "Teknologiantie 5 B, 90570")
        )
        googleMap.addMarker(
            MarkerOptions()
                .position(MERIKOSKI)
                .title("Merikosken Eläinklinikka Oulu, " +
                        "Toivoniementie 4, 90500")
        )
        googleMap.addMarker(
            MarkerOptions()
                .position(KAMU)
                .title("Eläinlääkariasema Kamu Oy, " +
                        "Kansankatu 48, 90100")
        )
        googleMap.addMarker(
            MarkerOptions()
                .position(SUN)
                .title("Eläinlääkariasema Sun Oy, " +
                        "Tuiskutie 3, 90630")
        )
        googleMap.addMarker(
            MarkerOptions()
                .position(LEENA)
                .title("Eläinlääkari Leena Oksanen, " +
                        "Nuutintie 13, 90650")
        )
        googleMap.addMarker(
            MarkerOptions()
                .position(SEUDUN)
                .title("Oulun seudun eläinlääkärivastaanotto, " +
                        "Poratie 7, 90140")
        )
        googleMap.addMarker(
            MarkerOptions()
                .position(OULUN)
                .title("Oulun Eläinklinikka Oy, " +
                        "Metsokankaantie 3, 90420")
        )
        googleMap.addMarker(
            MarkerOptions()
                .position(EVI)
                .title("Eläinsairaala Evidensia Oulu, " +
                        "Idealinja 13, 90410")
        )
        googleMap.addMarker(
            MarkerOptions()
                .position(NEMO)
                .title("Eläinlääkäriasema Nemo, " +
                        "Kauppatie 6 L3, 90440")
        )
        googleMap.addMarker(
            MarkerOptions()
                .position(HERTTAINEN)
                .title("Eläinlääkäriasema Herttainen, " +
                        "Kirkkotie 2, 90830")
        )
    }
}
