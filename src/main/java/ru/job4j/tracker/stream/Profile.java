package ru.job4j.tracker.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profile  {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static List<Address> collect(List<Profile> profiles){
        return profiles.stream()
                .map(profile -> profile.address)
                .sorted(new SortByCity())
                .distinct()
                .collect(Collectors.toList());
    }
}


