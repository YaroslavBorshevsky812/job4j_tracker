package ru.job4j.tracker;

public class TrackerSingleOne {
    private TrackerSingleOne() {
    }

    public static TrackerSingleOne getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    private static final class Holder {
        private static final TrackerSingleOne INSTANCE = new TrackerSingleOne();
    }
}

