package com.example.window.Views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.window.R;

public class TaskDetailsActivity extends AppCompatActivity {

    TextView tvTitle;
    TextView tvDescription;
    TextView tvCreation_date;
    TextView tvEnd_date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_details);
        initViews();

        Intent intent = getIntent();

        String taskTitle = intent.getStringExtra("task_title");
        String taskDescription = intent.getStringExtra("task_description");

        tvTitle.setText(taskTitle);
        tvDescription.setText(taskDescription);
    }

    void initViews(){
        tvTitle = findViewById(R.id.task_title);
        tvDescription = findViewById(R.id.task_description);
        tvCreation_date = findViewById(R.id.creation_date);
        tvEnd_date = findViewById(R.id.end_date);
    }
}
