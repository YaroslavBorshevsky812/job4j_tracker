package ru.job4j.tracker;

public class TrackerSingleOne {

    private Tracker tracker = new Tracker();

     public Tracker getInstance1(){
        return tracker;
    }


    public static TrackerSingleOne getInstance() {
        return new TrackerSingleOne();
    }

    public Item add(Item model) {
        return model;
    }
}

