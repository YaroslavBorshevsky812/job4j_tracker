package ru.job4j.tracker;

import org.junit.Test;

import java.util.Collection;
import java.util.zip.DeflaterInputStream;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SortByNameReverseTest {

    @Test
    public void Reverse(){
        Item item = new Item ("Peter");
        Item item1 = new Item ("Ivan");

        SortByNameReverse reverse = new SortByNameReverse();
        int selected = reverse.compare(item, item1);
        assertThat(selected, is(-7));
    }
}