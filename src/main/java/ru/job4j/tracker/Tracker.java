package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
    private final ArrayList<Item> items = new ArrayList<Item>();
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public ArrayList<Item> findAll(){
        return items;
    }

    public ArrayList<Item> findByName(String key){
        ArrayList<Item> equalName = new ArrayList<Item>();
        for (int index = 0; index < items.size(); index++) {
            Item name = items.get(index);
            if (name.getName().equals(key)) {
                equalName.add(name);
            }
        };
        return equalName;
    }
    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public boolean replace(int id, Item item) {
        boolean done = false;
        int index = indexOf(id);
            if (index != -1) {
                item.setId(id);
                items.set(index, item);
                done = true;
            }
        return done;
    }
    public boolean delete(int id) {
        boolean done = false;
        int index = indexOf(id);
        if (index != -1) {
            items.remove(items.get(index));
            done = true;
        }
        return done;
    }

}


