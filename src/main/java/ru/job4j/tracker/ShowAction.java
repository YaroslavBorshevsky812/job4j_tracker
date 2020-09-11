package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class ShowAction implements UserAction{

    private final Output out;

    public ShowAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Show all ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> items = tracker.findAll();
        for (int i = 0; i < items.size(); i++) {
            out.println(items.get(i));
        }
        return true;
    }
}
