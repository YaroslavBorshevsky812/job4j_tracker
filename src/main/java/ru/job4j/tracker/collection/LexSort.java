package ru.job4j.tracker.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        List<String> listLeft = Arrays.asList(left.split(" "));
        List<String> listRight = Arrays.asList(right.split(" "));

        for (int i = 0; i < 1; i++) {
            int num = Integer.parseInt(listLeft.get(i).substring(0,listLeft.get(i).length()-1));
            int num1 = Integer.parseInt(listRight.get(i).substring(0,listRight.get(i).length()-1));
            rsl = Integer.compare(num, num1);
        }
        return rsl;
    }

    public static void main(String[] args) {
        LexSort sort = new LexSort();
        String one = "10. ghbdtn";
        String two = "10. ghbdhdbth";
        System.out.println(sort.compare(one,two));
    }
}