package com.project.engineeringcollege;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class Main21Activity extends AppCompatActivity {

    long contact =9594962013L;

    CardView GMAP, WEBSITE, CALL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);



        GMAP=findViewById(R.id.cw1);
        WEBSITE=findViewById(R.id.cw2);
        CALL=findViewById(R.id.cw3);

        GMAP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String url ="https://www.google.com/maps/place/Shivajirao+S.+Jondhale+College+of+Engineering/@19.1979524,73.1060954,17z/data=!3m1!4b1!4m5!3m4!1s0x3be795757569a46b:0x864b94d61f571b24!8m2!3d19.1979524!4d73.1082841";
                Intent gmapintent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(gmapintent);
            }
        });

        WEBSITE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Web = "https://shivajiraojondhalecoe.org.in/";
                Intent webintent =new Intent(Intent.ACTION_VIEW,Uri.parse(Web));
                startActivity(webintent);

            }
        });

        CALL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+"0"+contact));
                startActivity(intent);
            }
        });

    }
}