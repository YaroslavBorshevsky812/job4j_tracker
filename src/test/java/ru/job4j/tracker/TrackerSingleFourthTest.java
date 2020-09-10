package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrackerSingleFourthTest {
    @Test
    public void name() {
        final Tracker instance = TrackerSingleFourth.getInstance().getTracker();
        final Tracker instance1 = TrackerSingleFourth.getInstance().getTracker();
        assertSame(instance, instance1);
    }
}