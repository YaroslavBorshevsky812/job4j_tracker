package ru.job4j.tracker.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Profile {
    private Address address;

    public static List<Address> collect(List<Profile> profiles){
        return profiles.stream().map(profile -> profile.address).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Profile profile = new Profile();
        Address address = new Address();
        profile.address = address;
        List<Profile> profileList = new ArrayList<>();
        profileList.add(profile);
        System.out.println(Profile.collect(profileList));
    }
}


