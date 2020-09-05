package ru.job4j.tracker.ex;

public class ElementNotFoundException extends Exception {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (String num : value) {
            rsl++;
            if (num.equals(key)) {
                break;
            }
        }
            return rsl;
    }
        public static void main (String[]args){
            String[] str = {"Москва", "Питер", "Париж"};
            try {
                System.out.println(indexOf(str, "Питер"));
            } catch (ElementNotFoundException e) {
                e.printStackTrace();
            }
        }
    }



