package ru.job4j.tracker;

public  class ReplaceAction implements UserAction {
    @Override
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
            System.out.println("=== Editing is done ===");
        }else {
            System.out.println("=== Error ===");
        }
        return true;
    }
}
