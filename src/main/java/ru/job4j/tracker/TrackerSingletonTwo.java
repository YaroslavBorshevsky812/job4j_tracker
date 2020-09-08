package ru.job4j.tracker;

public class TrackerSingletonTwo {

    private Tracker tracker = new Tracker();

    public Tracker getInstance1(){
        return tracker;
    }

        private static TrackerSingletonTwo instance;

        private TrackerSingletonTwo() {
        }

        public static TrackerSingletonTwo getInstance() {
            if (instance == null) {
                instance = new TrackerSingletonTwo();
            }
            return instance;
        }

        public Item add(Item model) {
            return model;
        }
    }

