package com.example.wambui.jambosafari;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class inc extends AppCompatActivity {
ImageButton a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inc);

        a=(ImageButton)findViewById(R.id.call);
        b=(ImageButton)findViewById(R.id.imageButton2);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:(+254)4409905"));
                startActivity(a);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.incrediblekenyaadventures.com/"));
                startActivity(a);
            }
        });
    }
}
