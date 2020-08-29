package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    private final Output out;

    public FindByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Find by ID ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askInt("=== Choose the Item ==="));
        Item item = tracker.findById(id);
        if (item != null) {
            out.println(item);
        } else {
            out.println("=== Not Founded ===");
        }
        return true;
    }
}
