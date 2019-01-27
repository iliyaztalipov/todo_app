package com.example.window.Models;

import java.util.Date;

public class Task {

    public String title;
    public String description;
    public Boolean isDone;
    public Date creationDate;
    public Date endDate;

    public Task (String title, String description){
        this.title = title;
        this.description = description;
    }
}
