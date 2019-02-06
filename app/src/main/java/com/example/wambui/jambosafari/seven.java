package com.example.wambui.jambosafari;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class seven extends AppCompatActivity {
    ImageButton a,b,c,d,e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven);
        a=(ImageButton)findViewById(R.id.call);
        b=(ImageButton)findViewById(R.id.imageButton2);
        c=(ImageButton)findViewById(R.id.fb);
        d=(ImageButton)findViewById(R.id.tweet);
        e=(ImageButton)findViewById(R.id.lnkd);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:(+254)753224816"));
                startActivity(a);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.sevenbyfartourskenya.com/"));
                startActivity(a);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/sevenbyfartravelkenya"));
                startActivity(a);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(Intent.ACTION_VIEW,Uri.parse("https://twitter.com/sevenbyfar"));
                startActivity(a);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(Intent.ACTION_VIEW,Uri.parse("https://ke.linkedin.com/in/sevenbyfartravel/"));
                startActivity(a);
            }
        });
    }
}
