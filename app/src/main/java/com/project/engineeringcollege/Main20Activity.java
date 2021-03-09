package com.project.engineeringcollege;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class Main20Activity extends AppCompatActivity {

    long contact = 2225327100L;

    CardView GMAP, WEBSITE, CALL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);


        GMAP=findViewById(R.id.cw1);
        WEBSITE=findViewById(R.id.cw2);
        CALL=findViewById(R.id.cw3);

        GMAP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url ="https://www.google.com/maps?rlz=1C1CHBF_enIN850IN850&biw=1536&bih=706&q=kc+college+of+engineering+thane&um=1&ie=UTF-8&sa=X&ved=0ahUKEwjHsdPusObiAhUVmuYKHTy5A1sQ_AUIECgB";
                Intent gmapintent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(gmapintent);
            }
        });


        WEBSITE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Web =
                        "https://www.kccemsr.edu.in/";
                Intent webintent =new Intent(Intent.ACTION_VIEW,Uri.parse(Web));
                startActivity(webintent);

            }
        });


        CALL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(Intent.ACTION_DIAL,Uri.parse("tel:"+"0"+contact));
                startActivity(intent);
            }
        });

    }
}