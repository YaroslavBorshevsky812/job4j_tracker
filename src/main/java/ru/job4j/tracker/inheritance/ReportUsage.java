package ru.job4j.tracker.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        JSONReport jsonReport = new JSONReport();
        String text = jsonReport.generate("Имя", "Тело");
        System.out.println(text);
    }

}
