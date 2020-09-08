package ru.job4j.tracker;

public class TrackerSingleThree {

    private Tracker tracker = new Tracker();

    public Tracker getInstance1(){
        return tracker;
    }

    private static final TrackerSingleThree INSTANCE = new TrackerSingleThree();

    private TrackerSingleThree() {
    }

    public static TrackerSingleThree getInstance() {
        return INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }
}

