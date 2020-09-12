package ru.job4j.tracker.collection;

import java.util.Objects;

public class User  {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    public int compareTo( User second) {
        int rsl = 0;
        CompareByName byName = new CompareByName();
        CompareByAge byAge = new CompareByAge();
        if(byName.compare(this, second) == 0){
           rsl = byAge.compare(this, second);
        }
        return rsl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}