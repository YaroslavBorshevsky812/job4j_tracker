package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator() +
                "0. === Exit ===" + System.lineSeparator()
        ));
    }

    @Test
    public void whenCreate() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "Ярослав", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator() +
                "0. Create" + System.lineSeparator() + "1. === Exit ===" + System.lineSeparator() +
                "=== Create a new Item ====" +
                System.lineSeparator() + "Menu." + System.lineSeparator() +
                "0. Create" + System.lineSeparator() +
                "1. === Exit ===" + System.lineSeparator()
        ));
    }
}

