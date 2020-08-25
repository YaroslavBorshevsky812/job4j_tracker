package ru.job4j.tracker.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Раз");
        list.add("Два");
        list.add("Три");

        for (Object value : list) {
            System.out.println(value);

        }
    }
}
