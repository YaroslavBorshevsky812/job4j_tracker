package ru.job4j.tracker.collection;

import java.util.Comparator;

public class JobPriorityCompare implements Comparator<Job> {

    @Override
    public int compare(Job first, Job second) {
        return Integer.compare(first.getPriority(), second.getPriority());
    }
}