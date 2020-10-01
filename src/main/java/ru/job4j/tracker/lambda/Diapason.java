package ru.job4j.tracker.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Diapason {

    public static List<Double> diapason(int start, int end, Function<Double, Double> func){
        List<Double> list = new ArrayList<>();
        for (int i = start; i < end; i++) {
            double s = (double) i;
                list.add(func.apply(s));
        }
        return list;
    }
}
