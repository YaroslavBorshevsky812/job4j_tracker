package ru.job4j.tracker.stream;

import java.util.Comparator;

public class SortByCity implements Comparator<Address> {
    @Override
    public int compare(Address left, Address right) {
        return left.getCity().compareTo(right.getCity());
    }
}
