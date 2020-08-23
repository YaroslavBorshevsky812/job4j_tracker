package ru.job4j.tracker;

import java.sql.SQLOutput;


public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                Item items[] = tracker.findAll();
                for (int i = 0; i < items.length; i++) {
                    Item item = items[i];
                    System.out.println(item);
                }
            }
            else if (select == 2) {
                    String textID = input.askStr("=== Enter ID of Item ===");
                    Item newItem = new Item();
                    String name = input.askStr("=== Enter new name ===");
                    newItem.setName(name);
                    int id = Integer.valueOf(textID);
                    if (tracker.replace(id, newItem)) {
                        System.out.println("=== Editing is done ===");
                    } else {
                        System.out.println("=== Error ===");
                    }
                } else if (select == 3) {
                    String text =input.askStr("=== Enter ID of item you want to delete ===");
                    int id = Integer.valueOf(text);
                    if (tracker.delete(id)) {
                        System.out.println("=== Item is deleted ===");
                    } else {
                        System.out.println("=== Error ===");
                    }
                } else if (select == 4) {
                    String text =  input.askStr("=== Choose the Item");
                    int id = Integer.valueOf(text);
                    Item item = tracker.findById(id);
                    if (item != null) {
                        System.out.println(item);
                    } else {
                        System.out.println("=== Not Founded ===");
                    }
                } else if (select == 5) {
                    String name =  input.askStr("=== Enter the name ===");
                    Item[] item = tracker.findByName(name);
                    if (item.length > 0) {
                        for (int i = 0; i < item.length; i++) {
                            Item item1 = item[i];
                            System.out.println(item);
                        }
                    } else {
                        System.out.println("=== There is no such a name ===");
                    }
                } else if (select == 6) {
                    run = false;
                }
            }
        }

    private void showMenu() {

        System.out.println(" \n " +
                "Menu.\n " +
                "0. Add new Item \n " +
                "1. Show all items \n " +
                "2. Edit item \n " +
                "3. Delete item \n " +
                "4. Find item by Id \n " +
                "5. Find items by name \n " +
                "6. Exit Program \n ");
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}