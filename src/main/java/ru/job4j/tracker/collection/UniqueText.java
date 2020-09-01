package ru.job4j.tracker.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String words:origin) {
            check.add(words);
        }
        for (String words:check) {
            if(!(check.contains(words))){
                rsl = false;
            }
            }
        return rsl;
    }
}
