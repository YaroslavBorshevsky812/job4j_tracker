package ru.job4j.tracker;

public class TrackerSingleOne {
    private static final TrackerSingleOne INSTANCE = new TrackerSingleOne();

    private Tracker tracker = new Tracker();

    private TrackerSingleOne() {
    }

    public static TrackerSingleOne getInstance() {
        return INSTANCE;
    }

    public Tracker getTracker(){
        return tracker;
    }

}

