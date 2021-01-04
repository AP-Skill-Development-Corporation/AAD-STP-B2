package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*Step-1: Create Variables for your views*/
    EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Step-2: Configure View ID's
                with the help of findviewbyID*/
        et1 = findViewById(R.id.username);
        et2 = findViewById(R.id.userpassword);

    }


    public void samplelogin(View view) {
        /*Step-3: Getting data from edit text and store into strings*/
        String name = et1.getText().toString();
        String pass = et2.getText().toString();
        /*Checking Conditions*/
        if (!name.isEmpty() && !pass.isEmpty()){
            if (name.equals("apssdc") && pass.equals("apssdc123")){
                Toast.makeText(this, "Login Sucess", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(this, "Login Fail", Toast.LENGTH_SHORT).show();
            }
        }else {
            Toast.makeText(this, "Please Enter Details", Toast.LENGTH_SHORT).show();
        }



    }
}