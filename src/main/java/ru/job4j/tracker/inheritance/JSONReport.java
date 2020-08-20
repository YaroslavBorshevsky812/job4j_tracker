package ru.job4j.tracker.inheritance;

public class JSONReport extends TextReport {

    public String generate(String name, String body){
        char quotes = '"';
        return (quotes + name + quotes + " : \"name\"" + System.lineSeparator() + quotes + body + quotes+ " : \"body\"");
    }
}
