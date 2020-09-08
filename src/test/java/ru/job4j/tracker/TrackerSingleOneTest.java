package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrackerSingleOneTest {
    @Test
    public void name(){

        final TrackerSingleOne instance = TrackerSingleOne.getInstance();
        final TrackerSingleOne instance1 = TrackerSingleOne.getInstance();
        assertSame(instance, instance1);

    }

}