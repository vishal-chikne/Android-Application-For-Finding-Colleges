package com.project.engineeringcollege;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,collegename,branch,percent;

    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name = findViewById(R.id.username);
        collegename = findViewById(R.id.collegename);
        branch = findViewById(R.id.Branch);
        percent = findViewById(R.id.diplomapercent);

        btnlogin = findViewById(R.id.btnlogin);



            btnlogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if (name.getText().toString().isEmpty()){
                        name.setError("Please Enter name");
                        name.setFocusable(true);
                    }else if (collegename.getText().toString().isEmpty()){
                        collegename.setError("Please Enter college name");
                        collegename.setFocusable(true);
                    }else if (branch.getText().toString().isEmpty()){
                        branch.setError("Please Enter branch");
                        branch.setFocusable(true);
                    }else if (percent.getText().toString().isEmpty()){
                        percent.setError("Please Enter percent");
                        percent.setFocusable(true);
                    }else{


                        Intent i = new Intent(MainActivity.this,CollegesDashboard.class);
                    i.putExtra("name",name.getText().toString());
                    i.putExtra("percent",Float.parseFloat(percent.getText().toString()));
                    startActivity(i);
                }
                }
            });
        }




}
