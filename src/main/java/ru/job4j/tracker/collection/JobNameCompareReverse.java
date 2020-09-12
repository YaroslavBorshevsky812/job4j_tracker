package ru.job4j.tracker.collection;

import java.util.Comparator;

public class JobNameCompareReverse implements Comparator<Job> {
    @Override
    public int compare(Job first, Job second) {
        return second.getName().compareTo(first.getName());
    }
}
