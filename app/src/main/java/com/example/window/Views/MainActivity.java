package com.example.window.Views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.window.Adapters.TasksAdapter;
import com.example.window.Interfaces.IOnClickListener;
import com.example.window.Models.Task;
import com.example.window.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements IOnClickListener {

    RecyclerView mainRecycler;
    TasksAdapter tasksAdapter;

    List<Task> tasks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTasks();
        initRecycler();

        mainRecycler = findViewById(R.id.main_recycler);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
    }

    void initTasks(){
        tasks = new ArrayList<>();
        tasks.add( new Task("Tasks1", "1"));
        tasks.add( new Task("Tasks2", "2"));
        tasks.add( new Task("Tasks3", "3"));

    }

    void initRecycler(){
        mainRecycler = findViewById(R.id.main_recycler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        tasksAdapter = new TasksAdapter(tasks, this);

        mainRecycler.setLayoutManager(layoutManager);
        mainRecycler.setAdapter(tasksAdapter);
    }

    @Override
    public void onClick() {
        Intent intent = new Intent(this, TaskDetailsActivity.class);
        startActivity(intent);
    }
}
