package ru.job4j.tracker;

import com.sun.tools.javac.Main;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class SortByNameItem implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        return first.getName().compareTo(second.getName());
    }
}
