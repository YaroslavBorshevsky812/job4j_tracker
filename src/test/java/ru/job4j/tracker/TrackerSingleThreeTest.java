package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrackerSingleThreeTest {
    @Test
    public void name() {

        final TrackerSingleThree instance = TrackerSingleThree.getInstance();
        final TrackerSingleThree instance1 = TrackerSingleThree.getInstance();
        assertSame(instance, instance1);
    }
}