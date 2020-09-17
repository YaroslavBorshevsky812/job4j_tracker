package ru.job4j.tracker.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.*;

public class SchoolTest {

    @Test
    public void classA(){
        List<Student> list = new ArrayList<>();
        Student student = new Student("Surname", 77);
        Student student1 = new Student("Surname", 69);
        Predicate<Student> predict = new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                boolean rsl = false;
                if(student.getScore() >=70 || student.getScore() <= 100){
                    rsl = true;
                }
                return rsl;
            }
        };
        list.stream().collect(list, predict.test());

        assertThat(list, hasItem(student));
    }
    @Test
    public void classB(){
        List<Student> list = new ArrayList<>();
        Student student = new Student("Surname", 51);
        Student student1 = new Student("Surname", 69);
        Predicate<Student> predict = new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                boolean rsl = false;
                if(student.getScore() >= 50 || student.getScore() < 70){
                    rsl = true;
                }
                return rsl;
            }
        };
        list.stream().collect(list, predict.test());

        assertThat(list, hasItem(student));
    }
    @Test
    public void classB(){
        List<Student> list = new ArrayList<>();
        Student student = new Student("Surname", 2);
        Student student1 = new Student("Surname", 69);
        Predicate<Student> predict = new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                boolean rsl = false;
                if(student.getScore() > 0 || student.getScore() < 50){
                    rsl = true;
                }
                return rsl;
            }
        };
        list.stream().collect(list, predict.test());

        assertThat(list, hasItem(student));
    }
}