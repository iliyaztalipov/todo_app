package com.example.window.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.window.Interfaces.IOnClickListener;
import com.example.window.Models.Task;
import com.example.window.R;
import com.example.window.Views.TaskViewHolder;

import java.util.List;

public class TasksAdapter extends RecyclerView.Adapter<TaskViewHolder> {

    List<Task> tasks;
    IOnClickListener listener;

    public TasksAdapter(List<Task> tasks, IOnClickListener listener){
        this.tasks = tasks;
        this.listener = listener;
    }

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_holder_task, viewGroup, false);
        TaskViewHolder vh = new TaskViewHolder(v, listener);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder taskViewHolder, int i) {
        taskViewHolder.onBind(tasks.get(i));
    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }
}
