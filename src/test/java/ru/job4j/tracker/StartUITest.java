package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"1", "0"}
        );
        Tracker tracker = new Tracker();
        ArrayList<UserAction> actions = new ArrayList<>();
                actions.add(new Exit());

        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                String.format(
                        "Menu.%n"
                                + "0. === Exit ===" + System.lineSeparator()
                                + "Wrong input, you can select: 0 .. 0" + System.lineSeparator()
                                + "Menu." + System.lineSeparator()
                                + "0. === Exit ===" + System.lineSeparator()
                )
        ));
    }

}

