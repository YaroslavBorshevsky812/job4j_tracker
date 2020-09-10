package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonVersionTwoTest {
    @Test
    public void name() {
        final Tracker instance = SingletonVersionTwo.getInstance().getTracker();
        final Tracker instance1 = SingletonVersionTwo.getInstance().getTracker();
        assertSame(instance, instance1);
    }

}