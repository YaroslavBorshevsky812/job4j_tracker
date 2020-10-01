package ru.job4j.tracker.collection;

import com.sun.source.tree.Tree;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        TreeSet<String> tmp = new TreeSet<String>();
    for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                el = start += el + "/";
                    tmp.add(el.substring(0, el.length()-1));
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }
    public static void sortDesc(List<String> orgs) {
        orgs.sort(new DepDescComp());
    }
}
