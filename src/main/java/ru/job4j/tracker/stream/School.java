package ru.job4j.tracker.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students
                .stream()
                .filter(predict)
                .collect(Collectors.toList());
    }
    public static Map<String, Student> convert(List<Student> students){
        Map<String, Student> map =  students.stream()
                .collect(Collectors.toMap(student -> student.getSurname(), student -> student));
        return  map;
    }
}
