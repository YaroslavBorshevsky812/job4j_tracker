package ru.job4j.tracker.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.*;

public class SchoolTest {

    public void classA(){
        Predicate<Student> predict = new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
               boolean rsl = true;
                if (student.getScore() <= 70 || student.getScore() >= 100){
                    rsl = true;
                }
                return rsl;
            }
        };
        List<Student> list = new ArrayList<>();
        list.stream().collect(list, predict.test(student));
    }
}