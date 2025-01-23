package de.telran.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Task> task1 = new ArrayList<>();
        task1.add(new Task(0, "wolking with a dog", true));
        task1.add(new Task(1, "wolking with a cat", false));
        task1.add(new Task(2, "wolking with a eagle", true));
        task1.add(new Task(3, "wolking with a maus", false));
        task1.add(new Task(4, "wolking with a dog", true));
        task1.add(new Task(5, "wolking with a dog", false));
        task1.add(new Task(6, "wolking with a dog", true));
        task1.add(new Task(7, "wolking with a dog", false));

        TaskList taskList = new TaskList(task1);
        TaskIterator tree = taskList.getUncompletedTaskIterator();
        System.out.println(tree.task.get
                (tree.currentIndex).description);
        System.out.println(tree.task.get
                (tree.currentIndex).completed);

        Iterator<Task> iterator= task1.iterator();
        while(iterator.hasNext()) {
            Task task11 = iterator.next();
            System.out.println(task11);
            if("".equals(task11)) {
                iterator.remove();
//
            }

        }
    }
}
