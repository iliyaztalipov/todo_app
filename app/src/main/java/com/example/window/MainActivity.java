package com.example.window;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.window.Adapters.TasksAdapter;
import com.example.window.Models.Task;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

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
        tasksAdapter = new TasksAdapter(tasks);

        mainRecycler.setLayoutManager(layoutManager);
        mainRecycler.setAdapter(tasksAdapter);
    }
}
