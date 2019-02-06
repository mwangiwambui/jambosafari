package com.example.wambui.jambosafari;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ListView view;

    String[] title = {"Mwema Africa Safaris",
            "It Started in Africa",
            "Seven By Far Travel",
            "Kenya Walking Survivors Ltd",
            "Wildbeest Safaris Ltd",
            "Features African Journeys",
            "Solaris Tours and Safaris",
    "Bienvenido Kenya Tours and Safaris",
            "Incredible Kenya Adventure Tours and Safaris",
    "Travel For Change Africa"};
    int[] images = {

            R.drawable.mwema,
            R.drawable.it,
            R.drawable.seven,
            R.drawable.kenya,
            R.drawable.wildebeest,
            R.drawable.features,
            R.drawable.solaris,
            R.drawable.b,
            R.drawable.incredible,
            R.drawable.travel

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view=(ListView)findViewById(R.id.view);

        List<HashMap<String,String>> alist=new ArrayList<HashMap<String, String>>();
        for (int i=0;i<10;i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("title", "" + title[i]);
            hm.put("image", Integer.toString(images[i]));
            alist.add(hm);


            String[] from = {"image", "title"};
            int[] to = {R.id.imageView10, R.id.topic};
            SimpleAdapter j = new SimpleAdapter(getBaseContext(), alist, R.layout.support, from, to);
            view.setAdapter(j);
        }
        view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent c=new Intent(MainActivity.this,mwema.class);
                    startActivity(c);
                }
                else if (position==1){
                    Intent c=new Intent(MainActivity.this,it.class);
                    startActivity(c);
                }
                else if(position==2){
                    Intent c=new Intent(MainActivity.this,seven.class);
                    startActivity(c);
                }
                else if(position==3){
                    Intent c=new Intent(MainActivity.this,kenya.class);
                    startActivity(c);
                }
                else if(position==4){
                    Intent c=new Intent(MainActivity.this,wild.class);
                    startActivity(c);
                }
                else if(position==5){
                    Intent c=new Intent(MainActivity.this,features.class);
                    startActivity(c);
                }
                else if(position==6){
                    Intent c=new Intent(MainActivity.this,solaris.class);
                    startActivity(c);
                }
                else if(position==7) {
                    Intent c = new Intent(MainActivity.this, bien.class);
                    startActivity(c);
                }
                else if(position==8) {
                    Intent c = new Intent(MainActivity.this, inc.class);
                    startActivity(c);
                }
                else if(position==9) {
                    Intent c = new Intent(MainActivity.this, travel.class);
                    startActivity(c);
                }
            }
        });





        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Intent d=new Intent(new Intent(MainActivity.this,MapsActivity.class));
            startActivity(d);
        } else if (id == R.id.nav_gallery) {
            Intent d=new Intent(new Intent(MainActivity.this,about.class));
            startActivity(d);


        } else if (id == R.id.nav_send) {
            Intent a=new Intent(Intent.ACTION_SEND);
            a.setData(Uri.parse("email"));
            String [] s= {"jambo.safaridirectory@gmail.com"};
            a.putExtra(Intent.EXTRA_EMAIL,s);
            a.putExtra(Intent.EXTRA_SUBJECT,"");
            a.putExtra(Intent.EXTRA_TEXT,"");
            a.setType("message/rfc822");
            Intent chooser=Intent.createChooser(a,"Launch Email");
            startActivity(chooser);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
