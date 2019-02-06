package com.example.wambui.jambosafari;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng Arberdare = new LatLng(-0.3671500,36.6587800);
        mMap.addMarker(new MarkerOptions().position(Arberdare).title("Marker in Arberdare National Park"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Arberdare));

        LatLng Amboseli = new LatLng(-2.7355322,37.36823559999993);
        mMap.addMarker(new MarkerOptions().position(Amboseli).title("Marker in Amboseli National Park"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Amboseli));

        LatLng Arabuko  = new LatLng(-0.3671500,36.6587800);
        mMap.addMarker(new MarkerOptions().position(Arabuko).title("Marker in Arabuko Sokoke Forest Reserve"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Arabuko));

        LatLng Buffalo = new LatLng(0.521479,37.61737);
        mMap.addMarker(new MarkerOptions().position(Buffalo).title("Marker in Buffalo Springs NR"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Buffalo));

        LatLng Chyulu = new LatLng(-2.36,37.51);
        mMap.addMarker(new MarkerOptions().position(Chyulu).title("Marker in Chyulu Hills National Park"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Chyulu));

        LatLng Hell = new LatLng( -0.5457,36.1848  );
        mMap.addMarker(new MarkerOptions().position(Hell).title("Marker in Hell's gate National Park"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Hell));

        LatLng Mara = new LatLng( -1.2924,35.838  );
        mMap.addMarker(new MarkerOptions().position(Mara).title("Marker in Maasai Mara National Reseerve"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Mara));

        LatLng Nakuru = new LatLng( -0.22,36.05  );
        mMap.addMarker(new MarkerOptions().position(Nakuru).title("Marker in Lake Nakuru National Park"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Nakuru));

        LatLng Sabuk = new LatLng( -1.1401,37.2570  );
        mMap.addMarker(new MarkerOptions().position(Sabuk).title("Marker in Ol Donyo Sabuk National Park"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Sabuk));

        LatLng Nairobi = new LatLng( -1.3667,36.8333  );
        mMap.addMarker(new MarkerOptions().position(Nairobi).title("Marker in Nairobi National Park"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Nairobi));



        mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                if (marker.getTitle().toString().contains("Arberdare")) {
                    Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kws.go.ke/content/aberdare-national-park"));
                    startActivity(a);
                }
                else if(marker.getTitle().toString().contains("Amboseli")){
                    Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kws.go.ke/amboseli-national-park"));
                    startActivity(a);

                }
                else if(marker.getTitle().toString().contains("Arabuko")){
                    Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naturaltoursandsafaris.com/arabuko_sokoke_forest_reserve.php"));
                    startActivity(a);

                }
                else if(marker.getTitle().toString().contains("Buffalo")){
                    Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.fkingssafaris.com/BuffaloSpringsNationalReserve.htm"));
                    startActivity(a);

                }
                else if(marker.getTitle().toString().contains("Chyulu")){
                    Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kws.go.ke/content/chyulu-hills-national-park"));
                    startActivity(a);

                }
                else if(marker.getTitle().toString().contains("Hell's")){
                    Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kws.go.ke/content/hells-gate-national-park"));
                    startActivity(a);

                }
                else if(marker.getTitle().toString().contains("Maasai")){
                    Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("https://plus.google.com/photos/photo/107596720710036391761/6400613074571478338"));
                    startActivity(a);


                }
                else if(marker.getTitle().toString().contains("Nakuru")){
                    Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kws.go.ke/lake-nakuru-national-park"));
                    startActivity(a);

                }
                else if(marker.getTitle().toString().contains("Ol")){
                    Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kws.go.ke/content/ol-donyo-sabuk-national-park"));
                    startActivity(a);

                }
                else if(marker.getTitle().toString().contains("Nairobi")){
                    Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kws.go.ke/parks/nairobi-national-park"));
                    startActivity(a);

                }
            }




                });

        }


}
