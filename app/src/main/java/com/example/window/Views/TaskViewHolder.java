package com.example.window.Views;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.window.Models.Task;
import com.example.window.R;

public class TaskViewHolder extends RecyclerView.ViewHolder{
    TextView tvTitle;
    TextView tvDescription;

    public TaskViewHolder (View v){
        super(v);
        tvTitle = v.findViewById(R.id.vh_task_title);
        tvDescription = v.findViewById(R.id.vh_task_description);
    }

    public void onBind (Task task){
        tvTitle.setText(task.title);
        tvDescription.setText(task.description);
    }
}
