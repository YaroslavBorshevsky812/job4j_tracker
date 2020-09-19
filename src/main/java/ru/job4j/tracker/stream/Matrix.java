package ru.job4j.tracker.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Matrix {
    public static void main(String[] args) {

        Integer[][] matrix = {{1, 2}, {3, 4}};

        System.out.println(Arrays.stream(matrix).flatMap(e -> Arrays.stream(e)).collect(Collectors.toList()));
    }
}
