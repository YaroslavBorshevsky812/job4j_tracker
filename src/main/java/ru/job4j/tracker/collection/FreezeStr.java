package ru.job4j.tracker.collection;

import java.util.Comparator;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        if (left.length() != right.length()) {
            return false;
        }

        int[] letters = new int [2000];

        char[] s_array = left.toCharArray();
        for (char c : s_array) {
            letters[c]++;
        }

        for (int i = 0; i < right.length(); i++) {
            int c = (int) right.charAt(i);
            if (--letters[c] < 0) {
                return false;
            }
        }

        return true;
    }
}
