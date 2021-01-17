package com.muneiah.example.myroomdb;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "student_table")
public class StudentEntity {
    @ColumnInfo(name = "name")
    @NonNull
    String name;
    @PrimaryKey
    @ColumnInfo(name = "rollnumber")
    @NonNull
    String rollnumber;

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    @NonNull
    public String getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(@NonNull String rollnumber) {
        this.rollnumber = rollnumber;
    }
}
