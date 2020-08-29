package ru.job4j.tracker;

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
        Item items[] = tracker.findAll();
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            out.println(item);
        }
        return true;
    }
}
