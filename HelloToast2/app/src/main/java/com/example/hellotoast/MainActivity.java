package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Create Variables
    Button b1;
    TextView tv;
    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configure View ID's
        b1 = findViewById(R.id.countINC);
        tv = findViewById(R.id.textcount);

        //Handling Click Events
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // implement your own action
                a++;
                tv.setText(""+a);
            }
        });
    }

    public void displayToast(View view) {
        //Toast.makeText(context,"Text",Timeduration).show();
        Toast.makeText(this,"Hello APSSDC",Toast.LENGTH_LONG).show();
    }
}