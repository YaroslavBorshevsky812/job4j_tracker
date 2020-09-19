package ru.job4j.tracker.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MatrixTest {
    @Test
    public void Sort(){
        Integer[][] matrix = {{1,2},{3,4}};
        List<Integer> rsl = Matrix.convert(matrix);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        assertThat(rsl, is(expected));
    }
}