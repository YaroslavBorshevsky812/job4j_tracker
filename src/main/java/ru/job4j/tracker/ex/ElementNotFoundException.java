package ru.job4j.tracker.ex;

public class ElementNotFoundException extends Exception {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if(rsl == -1){
            throw new  ElementNotFoundException();
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



