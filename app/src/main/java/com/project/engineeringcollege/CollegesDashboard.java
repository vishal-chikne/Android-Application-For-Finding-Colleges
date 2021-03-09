package com.project.engineeringcollege;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class CollegesDashboard extends AppCompatActivity {

    CardView KC, SHIVAJI, ARMIET, UNIVERSAL, BHARAT, LOKMANIYA, PILLAI, INDIRA, KALSEKAR, DATTA, BHARTI, ACPATIL;
    TextView name,per;
    String n;
    float p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colleges_dashboard);

        name = findViewById(R.id.name);
        per = findViewById(R.id.per);

        KC = findViewById(R.id.tnm1);
        SHIVAJI = findViewById(R.id.tnm2);
        ARMIET = findViewById(R.id.tnm3);
        UNIVERSAL = findViewById(R.id.tnm4);
        BHARAT = findViewById(R.id.tnm5);
        LOKMANIYA = findViewById(R.id.tnm6);
        PILLAI = findViewById(R.id.tnm7);
        INDIRA = findViewById(R.id.tnm8);
        KALSEKAR = findViewById(R.id.tnm9);
        DATTA = findViewById(R.id.tnm10);
        BHARTI = findViewById(R.id.tnm11);
        ACPATIL = findViewById(R.id.tnm12);

        n = getIntent().getStringExtra("name");

        p = getIntent().getFloatExtra("percent",0);


        name.setText(n);


        per.setText("Percent: "+p+" %");


        if (p < 40){
            KC.setVisibility(View.GONE);
            SHIVAJI.setVisibility(View.GONE);
            ARMIET.setVisibility(View.GONE);
            UNIVERSAL.setVisibility(View.GONE);
            BHARAT.setVisibility(View.GONE);
            LOKMANIYA.setVisibility(View.GONE);
            PILLAI.setVisibility(View.GONE);
            INDIRA.setVisibility(View.GONE);
            KALSEKAR.setVisibility(View.GONE);
            DATTA.setVisibility(View.GONE);
            BHARTI.setVisibility(View.GONE);
            ACPATIL.setVisibility(View.GONE);

            Toast.makeText(CollegesDashboard.this,"Sorry Better luck next time",Toast.LENGTH_LONG).show();

        }else
        if (p <= 50) {

            KC.setVisibility(View.VISIBLE);
            BHARAT.setVisibility(View.VISIBLE);
            KALSEKAR.setVisibility(View.VISIBLE);
            ACPATIL.setVisibility(View.VISIBLE);

        } else if (p <= 60) {
            KC.setVisibility(View.VISIBLE);

            UNIVERSAL.setVisibility(View.VISIBLE);

            BHARAT.setVisibility(View.VISIBLE);

            PILLAI.setVisibility(View.VISIBLE);

            KALSEKAR.setVisibility(View.VISIBLE);

            ACPATIL.setVisibility(View.VISIBLE);
        } else if (p <= 70) {
            KC.setVisibility(View.VISIBLE);
            UNIVERSAL.setVisibility(View.VISIBLE);
            BHARAT.setVisibility(View.VISIBLE);
            LOKMANIYA.setVisibility(View.VISIBLE);
            PILLAI.setVisibility(View.VISIBLE);
            KALSEKAR.setVisibility(View.VISIBLE);
            DATTA.setVisibility(View.VISIBLE);
            BHARTI.setVisibility(View.VISIBLE);
            ACPATIL.setVisibility(View.VISIBLE);
        } else if (p <= 85) {
            KC.setVisibility(View.VISIBLE);
            SHIVAJI.setVisibility(View.VISIBLE);
            UNIVERSAL.setVisibility(View.VISIBLE);
            BHARAT.setVisibility(View.VISIBLE);
            LOKMANIYA.setVisibility(View.VISIBLE);
            PILLAI.setVisibility(View.VISIBLE);
            KALSEKAR.setVisibility(View.VISIBLE);
            DATTA.setVisibility(View.VISIBLE);
            BHARTI.setVisibility(View.VISIBLE);
            ACPATIL.setVisibility(View.VISIBLE);
        } else if (p <= 100) {
            KC.setVisibility(View.VISIBLE);
            SHIVAJI.setVisibility(View.VISIBLE);
            ARMIET.setVisibility(View.VISIBLE);
            UNIVERSAL.setVisibility(View.VISIBLE);
            BHARAT.setVisibility(View.VISIBLE);
            LOKMANIYA.setVisibility(View.VISIBLE);
            PILLAI.setVisibility(View.VISIBLE);
            INDIRA.setVisibility(View.VISIBLE);
            KALSEKAR.setVisibility(View.VISIBLE);
            DATTA.setVisibility(View.VISIBLE);
            BHARTI.setVisibility(View.VISIBLE);
            ACPATIL.setVisibility(View.VISIBLE);
        } else {
            KC.setVisibility(View.GONE);
            SHIVAJI.setVisibility(View.GONE);
            ARMIET.setVisibility(View.GONE);
            UNIVERSAL.setVisibility(View.GONE);
            BHARAT.setVisibility(View.GONE);
            LOKMANIYA.setVisibility(View.GONE);
            PILLAI.setVisibility(View.GONE);
            INDIRA.setVisibility(View.GONE);
            KALSEKAR.setVisibility(View.GONE);
            DATTA.setVisibility(View.GONE);
            BHARTI.setVisibility(View.GONE);
            ACPATIL.setVisibility(View.GONE);
        }

        KC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CollegesDashboard.this, Main20Activity.class);
                startActivity(intent);
            }
        });
        SHIVAJI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CollegesDashboard.this, Main21Activity.class);
                startActivity(intent);
            }
        });
        ARMIET.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CollegesDashboard.this, Main22Activity.class);
                startActivity(intent);
            }
        });
        UNIVERSAL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CollegesDashboard.this, Main23Activity.class);
                startActivity(intent);
            }
        });
        BHARAT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CollegesDashboard.this, Main24Activity.class);
                startActivity(intent);
            }
        });
        LOKMANIYA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CollegesDashboard.this, Main25Activity.class);
                startActivity(intent);
            }
        });
        PILLAI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CollegesDashboard.this, Main26Activity.class);
                startActivity(intent);
            }
        });
        INDIRA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CollegesDashboard.this, Main27Activity.class);
                startActivity(intent);
            }
        });
        KALSEKAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CollegesDashboard.this, Main28Activity.class);
                startActivity(intent);
            }
        });
        DATTA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CollegesDashboard.this, Main29Activity.class);
                startActivity(intent);
            }
        });
        BHARTI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CollegesDashboard.this, Main30Activity.class);
                startActivity(intent);
            }
        });
        ACPATIL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CollegesDashboard.this, Main31Activity.class);
                startActivity(intent);
            }
        });


    }
}
