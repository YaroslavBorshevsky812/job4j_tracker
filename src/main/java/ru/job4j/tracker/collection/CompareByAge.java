package ru.job4j.tracker.collection;

public class CompareByAge {

    public int compare (User first, User second){
        return Integer.compare(first.getAge(), second.getAge());
    }
}
