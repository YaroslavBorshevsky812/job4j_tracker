package ru.job4j.tracker.oop;

public class Profession {

    private String name;
    private String surname;
    private String education;
    private int birthday;

    public String getName(String name) {
        this.name = name;
        return null;
    }

    public String getSurname(String surname) {
        this.surname = surname;
        return null;
    }

    public String getEducation(String education) {
        this.education = education;
        return null;
    }

    public int getBirthday(int birthday) {
        this.birthday = birthday;
        return birthday;
    }

    public static void main(String[] args) {
        Surgeon turk = new Surgeon();
        turk.getName("Tёрк");
        MD jd = new MD();
        jd.getName("Джей Ди");
    }
}
