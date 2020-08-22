package ru.job4j.tracker.poly;

public class Bus implements Transport {
    @Override
    public String move() {
        return null;
    }

    @Override
    public int passengers(int num) {
        return 0;
    }

    @Override
    public int tank(int fuel) {
        int cost = 40;
        int price = fuel*cost;
        return price;
    }
}
