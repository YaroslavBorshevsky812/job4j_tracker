package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrackerSingleTwoTest {

    @Test
    public void name() {
        final TrackerSingletonTwo instance = TrackerSingletonTwo.getInstance();
        final TrackerSingletonTwo instance1 = TrackerSingletonTwo.getInstance();
        assertSame(instance, instance1);
    }
}