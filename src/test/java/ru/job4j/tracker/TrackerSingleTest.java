package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrackerSingleTest {

    @Test
    public void name() {
        final Tracker instance = TrackerSingle.INSTANCE.getInstance();
        final Tracker instance1 = TrackerSingle.INSTANCE.getInstance();
        assertSame(instance, instance1);
    }
}