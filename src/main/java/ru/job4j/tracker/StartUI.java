package ru.job4j.tracker;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
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
                    System.out.println("=== Enter ID of Item ===");
                    String textID = scanner.nextLine();
                    System.out.println("=== Enter new name ===");
                    Item newItem = new Item();
                    String name = scanner.nextLine();
                    newItem.setName(name);
                    int id = Integer.valueOf(textID);
                    if (tracker.replace(id, newItem)) {
                        System.out.println("=== Editing is done ===");
                    } else {
                        System.out.println("=== Error ===");
                    }
                } else if (select == 3) {
                    System.out.println("=== Enter ID of item you want to delete ===");
                    String text = scanner.nextLine();
                    int id = Integer.valueOf(text);
                    if (tracker.delete(id)) {
                        System.out.println("=== Item is deleted ===");
                    } else {
                        System.out.println("=== Error ===");
                    }
                } else if (select == 4) {
                    System.out.println("=== Choose the Item");
                    String text = scanner.nextLine();
                    int id = Integer.valueOf(text);
                    Item item = tracker.findById(id);
                    if (item != null) {
                        System.out.println(item);
                    } else {
                        System.out.println("=== Not Founded ===");
                    }
                } else if (select == 5) {
                    System.out.println("=== Enter the name ===");
                    String name = scanner.nextLine();
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
                "6. Exit Program \n " +
                "Select: ");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}