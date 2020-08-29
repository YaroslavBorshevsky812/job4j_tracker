package ru.job4j.tracker;

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
        Item[] item = tracker.findByName(input.askStr("=== Enter the name ==="));
        if (item.length > 0) {
            for (int i = 0; i < item.length; i++) {
                Item item1 = item[i];
                out.println(item);
            }
        }else {
            out.println("=== There is no such a name ===");
        }
        return true;
    }
}
