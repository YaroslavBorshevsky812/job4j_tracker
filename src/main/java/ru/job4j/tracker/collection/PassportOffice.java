package ru.job4j.tracker.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!(Map.of().containsKey(citizen.getPassport()))) {
            citizens.put(citizen.getPassport(), citizen);
        }
        return rsl;
    }


    public Citizen get(String passport) {
        return this.citizens.get(passport);
    }
}
