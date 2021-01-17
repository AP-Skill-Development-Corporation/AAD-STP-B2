package com.muneiah.example.myroomdb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText name,rollnum;
StudentDataBase dataBase;
StudentEntity entity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.et_name);
        rollnum=findViewById(R.id.et_id);
        dataBase= Room.databaseBuilder(this,StudentDataBase.class,"muni").allowMainThreadQueries().build();

    }

    public void saveData(View view) {
       String myname= name.getText().toString();
       String myrollnumber= rollnum.getText().toString();
       entity=new StudentEntity();
       entity.setName(myname);
       entity.setRollnumber(myrollnumber);
       dataBase.studentDAO().insert(entity);
        Toast.makeText(this, "Save Successfully: "+myname, Toast.LENGTH_SHORT).show();


    }

    public void retriveData(View view) {
    }
}