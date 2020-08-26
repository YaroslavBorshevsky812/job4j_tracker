package ru.job4j.tracker.search;

import com.sun.security.jgss.GSSUtil;

import java.util.LinkedList;


    public class PriorityQueue {
        private LinkedList<Task> tasks = new LinkedList<>();
        public void put(Task task) {
            int index = 0;
            for (Task element : tasks) {
                if(element.getPriority() <= task.getPriority()){
                    index++;
                } else {
                    break;
                }
            }
            this.tasks.add(index,task);
        }
        public Task take() {
            return tasks.poll();
        }



    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        Task task = new Task("Купить молоко", 2);
        q.put(task);
        System.out.println(q.take());

    }
}
