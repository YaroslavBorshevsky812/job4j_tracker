package ru.job4j.tracker.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamUsage {

    public static int filter (Predicate<Integer> predicate, int x, List<Integer> list){
        int positive = 0;
        for (Integer num:list) {
            if (predicate.test(num)){
                positive = num;
            }
        }
        return positive;
    }

    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        List<Integer> numOfPositive = numList.stream().filter(
                num -> num > 0).collect(Collectors.toList());
    }
}

