package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Delete ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("=== Enter ID of item you want to delete ===");
        if (tracker.delete(id)) {
            out.println("=== Item is deleted ===");
        }else {
            out.println("=== Error ===");
        }
        return true;
    }
}
