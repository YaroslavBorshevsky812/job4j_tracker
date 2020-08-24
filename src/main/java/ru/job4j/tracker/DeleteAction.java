package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Enter ID of item you want to delete ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.valueOf(name());
        if (tracker.delete(id)) {
            System.out.println("=== Item is deleted ===");
        }else {
            System.out.println("=== Error ===");
        }
        return true;
    }
}
