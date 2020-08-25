package ru.job4j.tracker;

public class ShowAction implements UserAction{
    @Override
    public String name() {
        return "=== Found All Items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item items[] = tracker.findAll();
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            System.out.println(item);
        }
        return true;
    }
}
