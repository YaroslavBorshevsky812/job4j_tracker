package ru.job4j.tracker;

public class TrackerSingletonTwo {

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

