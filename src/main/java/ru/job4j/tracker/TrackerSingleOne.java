package ru.job4j.tracker;

public class TrackerSingleOne {

    private TrackerSingleOne tracker = new TrackerSingleOne().getInstance().tracker;

    private TrackerSingleOne() {
    }

    public static TrackerSingleOne getInstance() {
        return new TrackerSingleOne();
    }

    public Item add(Item model) {
        return model;
    }
}

