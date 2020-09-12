package ru.job4j.tracker;

import org.junit.Test;

import java.util.Collection;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void compareTo() {
        Item item = new Item ("Peter");
        Item item1 = new Item ("Ivan");
        int selected = item.getName().compareTo(item1.getName());
        assertThat(selected, is(7));
    }
}