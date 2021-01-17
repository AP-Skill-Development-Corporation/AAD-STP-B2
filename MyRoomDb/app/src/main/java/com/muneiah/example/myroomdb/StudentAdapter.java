package com.muneiah.example.myroomdb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {
    List<StudentEntity> list;
    Context ctx;

    public StudentAdapter(List<StudentEntity> list, Context ctx) {
        this.list = list;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new StudentViewHolder(LayoutInflater.from(ctx).inflate(R.layout.row_design,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class StudentViewHolder extends RecyclerView.ViewHolder {
        TextView edit_tv,delete_tv,name_tv,rollnum_tv;
        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);
            edit_tv=itemView.findViewById(R.id.row_edit);
            delete_tv=itemView.findViewById(R.id.row_delete);
            name_tv=itemView.findViewById(R.id.row_name);
            rollnum_tv=itemView.findViewById(R.id.row_rollNumber);
        }
    }
}
