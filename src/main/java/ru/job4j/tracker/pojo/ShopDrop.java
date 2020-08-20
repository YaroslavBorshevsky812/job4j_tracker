package ru.job4j.tracker.pojo;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        int buf = index + 1;
            if (buf != products.length) {
                products[index] = products[buf];
                products[buf] = null;
            } else {
                buf = 0;
                products[index] = null;
            }
        return products;
    }
}
