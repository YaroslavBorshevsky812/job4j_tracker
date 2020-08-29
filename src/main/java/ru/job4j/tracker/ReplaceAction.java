package ru.job4j.tracker;

public  class ReplaceAction implements UserAction {
    private final Output out;

    public  ReplaceAction(Output out) {
        this.out = out;
    }

    public String name() {
        return "=== Replace ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item newItem = new Item();
        String name = input.askStr("=== Enter new name ===");
        newItem.setName(name);
        int id = Integer.valueOf(input.askInt("=== Enter ID of Item ==="));
        if (tracker.replace(id, newItem)) {
            out.println("=== Editing is done ===");
        }else {
            out.println("=== Error ===");
        }
        return true;
    }
}
