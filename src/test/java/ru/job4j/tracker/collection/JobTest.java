package ru.job4j.tracker.collection;

import org.junit.Test;
import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;
public class JobTest {

    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobNameCompare().thenComparing(new JobPriorityCompare());
        int rsl = cmpNamePriority.compare(
                new Job("Petr", 0),
                new Job("Petr", 1)
        );
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenCompatorByNameAndProrityReverse() {
        Comparator<Job> cmpNamePriority = new JobNameCompareReverse().thenComparing(new JobPriorityCompareReverse());
        int rsl = cmpNamePriority.compare(
                new Job("Petr", 0),
                new Job("Ivan", 1)
        );
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenCompatorByNameAndProrityThenFirstMore() {
        Comparator<Job> cmpNamePriority = new JobNameCompare().thenComparing(new JobPriorityCompare());
        int rsl = cmpNamePriority.compare(
                new Job("Petr", 0),
                new Job("Ivan", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
}
