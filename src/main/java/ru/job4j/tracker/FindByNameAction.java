package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Enter the name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] item = tracker.findByName(name());
        if (item.length > 0) {
            for (int i = 0; i < item.length; i++) {
                Item item1 = item[i];
                System.out.println(item);
            }
        }else {
            System.out.println("=== There is no such a name ===");
        }
        return true;
    }
}
