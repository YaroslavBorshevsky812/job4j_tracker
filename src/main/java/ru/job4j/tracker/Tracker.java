package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll(){
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key){
        Item[] equalName = new Item[items.length];
        int size = 0;
        for (int index = 0; index < this.size; index++) {
            Item name = items[index];
            if (name.getName().equals(key)) {
                equalName[size] = name;
                size++;
            }
        }
        equalName = Arrays.copyOf(equalName, size);
        return equalName;
    }
    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        boolean done = false;
        int index = indexOf(id);
            if (index != -1) {
                item.setId(id);
                items[index] = item;
                done = true;
            }
        return done;
    }
    public boolean delete(int id) {
        boolean done = false;
        int index = indexOf(id);
        items[indexOf(id)] = null;
        System.arraycopy(items,  index + 1, items, index, size - index);
        items[size-1] = null;
        size--;
        done = true;
        return done;
    }
}

