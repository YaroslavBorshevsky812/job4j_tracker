package ru.job4j.tracker.ex;

public class Factorial {
    public static void main(String[] args) {

    }

    public int calc(int n) {
        int rsl = 1;
        if (n<0){
            throw new  IllegalArgumentException("n<0");
        }
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
