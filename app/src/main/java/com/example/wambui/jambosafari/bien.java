package com.example.wambui.jambosafari;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class bien extends AppCompatActivity {
ImageButton a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bien);
        a=(ImageButton)findViewById(R.id.call);
        b=(ImageButton)findViewById(R.id.imageButton2);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:(+254)717130579"));
                startActivity(a);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.bienvenidokenyasafaris.com/"));
                startActivity(a);
            }
        });
    }
}
