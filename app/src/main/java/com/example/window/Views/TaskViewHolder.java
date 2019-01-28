package com.example.window.Views;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.window.Interfaces.IOnClickListener;
import com.example.window.Models.Task;
import com.example.window.R;

public class TaskViewHolder extends RecyclerView.ViewHolder{
    TextView tvTitle;
    TextView tvDescription;
    IOnClickListener listener;
    int taskID = -1;

    public TaskViewHolder (View v, final IOnClickListener listener){
        super(v);
        tvTitle = v.findViewById(R.id.vh_task_title);
        tvDescription = v.findViewById(R.id.vh_task_description);
        this.listener = listener;
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(taskID);
            }
        });
    }

    public void onBind (Task task){
        taskID = task.id;
        tvTitle.setText(task.title);
        tvDescription.setText(task.description);
    }
}
