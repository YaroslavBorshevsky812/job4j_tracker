package ru.job4j.tracker.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.put(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        for (Account count : users.get(findByPassport(passport))) {
            if(count.equals(account)){
                System.out.println("Одинаковые");
        }

        }
    }

    public User findByPassport(String passport) {
        User some = new User(passport, "buf");
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)){
                some = user;
            }
        }
        return some;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account account = new Account(" ", 0);
        for (Account buf : users.get(findByPassport(passport))) {
            if(buf.getRequisite().equals(requisite)){
                account = buf;
            }
        }
        return account;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        boolean rsl = false;
        return rsl;
    }
}
