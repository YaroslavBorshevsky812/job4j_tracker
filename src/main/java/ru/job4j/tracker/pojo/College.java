package ru.job4j.tracker.pojo;

public class College {
    public static void main(String[] args) {
       Student boy = new Student();
       boy.setDate("04.08.20");
       boy.setName("Yaroslav");
       boy.setSurname("Borshevsky");
       System.out.println("Student "
               + boy.getName() + " " + boy.getSurname() + " got accepted to job4j at " + boy.getDate());
    }
}
