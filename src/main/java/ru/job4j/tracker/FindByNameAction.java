package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Find by Name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> item = tracker.findByName(input.askStr("=== Enter the name ==="));
        if (item.size() > 0) {
            for (int i = 0; i < item.size(); i++) {
                out.println(item.get(i));
            }
        }else {
            out.println("=== There is no such a name ===");
        }
        return true;
    }
}
