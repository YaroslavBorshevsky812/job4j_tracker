package ru.job4j.tracker.collection;

import com.sun.tools.javac.Main;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < left.length(); i++) {
            map.computeIfPresent(left.charAt(i), (key,value) -> value+1);
            map.putIfAbsent(left.charAt(i), 1);
        }
        for (int i = 0; i < right.length(); i++) {
            map.computeIfPresent(right.charAt(i), (key, value) -> value - 1);
            map.remove(right.charAt(i), 0);
        }
        return map.size() == 0;
    }

    public static void main(String[] args) {
        String s = "Hello";
        String s1 = "Hlloe";
        String f = "Hello";
        String f1 = "Halle";
        System.out.println(eq(s,s1));
        System.out.println(eq(f,f1));
    }
}
