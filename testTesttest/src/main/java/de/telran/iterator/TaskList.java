package de.telran.iterator;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<Task> tasks = new ArrayList<>();

    public TaskList(List<Task> tasks) {
        this.tasks = tasks;
    }

    public TaskIterator getUncompletedTaskIterator(){
        return new TaskIterator(tasks, 0);
    }
}
