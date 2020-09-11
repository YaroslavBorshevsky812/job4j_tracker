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
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = users.get(user);
            if (!(users.get(user).contains(account))) {
                list.add(account);
            }
        }
    }


    public User findByPassport(String passport) {
        User some = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                some = user;
                break;
            }
        }
        return some;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account account = null;
        User user = findByPassport(passport);
        if (user != null) {
            for (Account buf : users.get(user)) {
                if (buf.getRequisite().equals(requisite)) {
                    account = buf;
                    break;
                }
            }
        }
        return account;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        boolean rsl = true;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        User destUser = findByPassport(destPassport);
        if (srcAccount.getBalance() < amount || srcAccount == null) {
            rsl = false;
        } else


            return rsl;

    }
}
