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
        tasks.add( new Task(0,"Tasks1", "первый таск"));
        tasks.add( new Task(1,"Tasks2", "второй таск"));
        tasks.add( new Task(2,"Tasks3", "третий таск"));
    }

    void initRecycler(){
        mainRecycler = findViewById(R.id.main_recycler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        tasksAdapter = new TasksAdapter(tasks, this);

        mainRecycler.setLayoutManager(layoutManager);
        mainRecycler.setAdapter(tasksAdapter);
    }

    @Override
    public void onClick(int taskID) {
        Task task = null;

        for (int i=0; i< tasks.size(); i++){
            if (tasks.get(i).id == taskID){
                task = tasks.get(i);
                break;
            } else {
                Log.d("ololo", "Not found");
            }
        }

        if (task == null){
            return;
        }

        Intent intent = new Intent(this, TaskDetailsActivity.class);
        intent.putExtra("task_title", task.title);
        intent.putExtra("task_description", task.description);

        startActivity(intent);
    }
}
