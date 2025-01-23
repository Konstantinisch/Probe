package de.telran.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskIterator implements Iterator<Task> {


    List<Task> task = new ArrayList<>();

    int currentIndex;

    public TaskIterator(List<Task> task1, int currentIndex) {
        this.task = task1;
        this.currentIndex = currentIndex;
    }

    @Override
    public boolean hasNext() {
        while (currentIndex < task.size()) {
            if (task.get(currentIndex).completed) {

                return true;
            }
            currentIndex++;
        }
        return false;
    }


    @Override
    public Task next() {
        while (currentIndex < task.size()) {
            if (!task.get(currentIndex).completed) {
                Task task1 = task.get(currentIndex);
                if (!task1.completed)
                    return task1;
            }
        }
        return null;
    }

    public void reset () {
        System.out.println("Start position");
        currentIndex = 0;
    }

}