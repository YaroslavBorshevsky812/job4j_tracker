package ru.job4j.tracker.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Matrix {

    public static List<Integer> convert(Integer[][] matrix){
        return Arrays.stream(matrix).flatMap(e -> Arrays.stream(e)).collect(Collectors.toList());
    }
}
