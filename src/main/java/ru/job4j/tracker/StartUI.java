package ru.job4j.tracker;

import ru.job4j.tracker.poly.Transport;

import java.sql.SQLOutput;
import java.util.ArrayList;


public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, ArrayList<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.size()) {
                out.println("Wrong input, you can select: 0 .. " + (actions.size() - 1));
                continue;
            }
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(ArrayList<UserAction> actions) {
        out.println("Menu.");
        for (int index = 0; index < actions.size(); index++) {
            out.println(index + ". " + actions.get(index).name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = new Tracker();
        ArrayList<UserAction> actions = new ArrayList<>();
                actions.add(new CreateAction(output));
                actions.add(new ShowAction(output));
                actions.add(new ReplaceAction(output));
                actions.add(new DeleteAction(output));
                actions.add(new FindByIdAction(output));
                actions.add(new FindByNameAction(output));
                actions.add(new Exit());

        new StartUI(output).init(input, tracker, actions);
    }
}