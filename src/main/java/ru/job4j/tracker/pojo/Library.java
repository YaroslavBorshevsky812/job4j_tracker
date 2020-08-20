package ru.job4j.tracker.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("HeadFirst");
        Book second = new Book("Thinking in Java");
        Book third = new Book("Schildt Java");
        Book fourth = new Book("Clean code");
        Book[] library = new Book[4];
        library[0] = first;
        library[1] = second;
        library[2] = third;
        library[3] = fourth;

        for (int i = 0; i < library.length; i++) {
            Book buf = library[i];
            System.out.println(buf.getName());
        }
        library[0] = fourth;
        library[3] = first;
        System.out.println();
        for (int i = 0; i < library.length; i++) {
            Book buf = library[i];
            System.out.println(buf.getName());
        }
        System.out.println();
        for (int i = 0; i < library.length; i++) {
            if (library[i].getName().equals("Clean code")) {
                Book buf = library[i];
                System.out.println(buf.getName());
            } break;
        }
    }
}
