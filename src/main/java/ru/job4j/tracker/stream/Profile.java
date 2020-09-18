package ru.job4j.tracker.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Profile {
    private Address address;

    public static List<Address> collect(List<Profile> profiles){
        return profiles.stream().map(profile -> profile.address).collect(Collectors.toList());
    }
}


