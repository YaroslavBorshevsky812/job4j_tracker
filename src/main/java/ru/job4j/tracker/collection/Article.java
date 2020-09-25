package ru.job4j.tracker.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Article {
    public static boolean generateBy(String origin, String line) {
        boolean rsl = true;
        String origin1 = origin.replaceAll("[-+.^:,!]"," ");
        String line1 = line.replaceAll("[-+.^:,!]"," ");
        String [] originArray = origin1.split(" ");
        String [] lineArray = line1.split(" ");
        List<String> originList = new ArrayList<>(Arrays.asList(originArray));
        List<String> lineList = new ArrayList<>(Arrays.asList(lineArray));
        for (String lineWord:lineList) {
            if(!(originList.contains(lineWord))){
                System.out.println(lineWord + " "+ "Doesn't exists");
                rsl = false;
            };
        }
        return rsl;
    }
}
