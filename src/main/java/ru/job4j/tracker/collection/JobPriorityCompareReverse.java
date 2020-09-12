package ru.job4j.tracker.collection;

import java.util.Comparator;

public class JobPriorityCompareReverse implements Comparator<Job> {

    @Override
    public int compare(Job first, Job second) {
        return Integer.compare(second.getPriority(), first.getPriority());
    }
}
