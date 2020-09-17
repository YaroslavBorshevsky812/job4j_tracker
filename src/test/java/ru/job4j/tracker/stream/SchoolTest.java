package ru.job4j.tracker.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.*;

public class SchoolTest {

    @Test
    public void classA(){
        List<Student> list = new ArrayList<>();
        List<Student> resultList = new ArrayList<>();
        Student student = new Student("Surname", 77);
        Student student1 = new Student("Surname", 69);
        Predicate<Student> predict = student2 -> student.getScore() > 0 || student.getScore() <50;
        resultList.stream().collect(list, predict);


        assertThat(list, hasItem(student));
    }
    @Test
    public void classB(){
        List<Student> list = new ArrayList<>();
        List<Student> resultList = new ArrayList<>();
        Student student = new Student("Surname", 77);
        Student student1 = new Student("Surname", 69);

        resultList.stream()
                .filter(student2 -> student.getScore() >= 70)
                .filter(student2 -> student.getScore() <= 100)
                .collect(Collectors.toList());


        assertThat(list, hasItem(student));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(((Student) o).getScore(), student.getScore());
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }
}