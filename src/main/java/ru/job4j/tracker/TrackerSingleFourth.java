package ru.job4j.tracker;

public class TrackerSingleFourth {
    private TrackerSingleFourth() {
    }

    private Tracker tracker = new Tracker();

    public static TrackerSingleFourth getInstance() {
        return Holder.INSTANCE;
    }

    public Tracker getTracker(){
        return tracker;
    }

    private static final class Holder {
        private static final TrackerSingleFourth INSTANCE = new TrackerSingleFourth();
    }
}

