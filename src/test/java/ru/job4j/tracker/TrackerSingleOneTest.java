package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrackerSingleOneTest {

    @Test
    public void name() {
        final Tracker instance = TrackerSingleOne.getInstance().getTracker();
        final Tracker instance1 = TrackerSingleOne.getInstance().getTracker();
        assertSame(instance, instance1);
    }
}