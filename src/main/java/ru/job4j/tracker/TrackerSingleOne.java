package ru.job4j.tracker;

public class TrackerSingleOne {

    private Tracker tracker = new Tracker();

     public Tracker getInstance1(){
        return tracker;
    }


    private TrackerSingleOne tracker1 = new TrackerSingleOne().getInstance().tracker1;

    private TrackerSingleOne() {
    }

    public static TrackerSingleOne getInstance() {
        return new TrackerSingleOne();
    }

    public Item add(Item model) {
        return model;
    }
}

