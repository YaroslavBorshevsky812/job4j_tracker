package ru.job4j.tracker.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SchoolTest {
    private List<Student> students = new ArrayList<>();

    @Before
    public void setUp() {
        students.add(new Student("Surname1", 10));
        students.add(new Student("Surname2", 20));
        students.add(new Student("Surname3", 30));
        students.add(new Student("Surname3", 30));
        students.add(new Student("Surname3", 30));

    }
    @Test
    public void whenStudentListThenMap(){
        Map<String, Student> rsl = School.convert(students);
        Map<String, Student> extended = new HashMap<>();
        extended.put("Surname1", new Student("Surname1", 10));
        extended.put("Surname2", new Student("Surname2", 20));
        extended.put("Surname3", new Student("Surname3", 30));
        assertThat(rsl, is(extended));
    }
}
    /*@Test
    public void classA() {
        Predicate<Student> pr = st -> st.getScore() >= 70 && st.getScore() <= 100;
        List<Student> rsl = new School().collect(students, pr);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student("Surname7", 70));
        expected.add(new Student("Surname8", 80));
        expected.add(new Student("Surname9", 90));
        assertThat(rsl, is(expected));
    }
    @Test
    public void classB(){
        Predicate<Student> pr = st -> st.getScore() >= 50 && st.getScore() <= 70;
        List<Student> rsl = new School().collect(students, pr);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student("Surname5", 50));
        expected.add(new Student("Surname6", 60));
        expected.add(new Student("Surname7", 70));
        assertThat(rsl, is(expected));
    }
    @Test
    public void classC(){
        Predicate<Student> pr = st -> st.getScore() > 0 && st.getScore() < 50;
        List<Student> rsl = new School().collect(students, pr);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student("Surname1", 10));
        expected.add(new Student("Surname2", 20));
        expected.add(new Student("Surname3", 30));
        expected.add(new Student("Surname4", 40));
        assertThat(rsl, is(expected));
    }*/

