package ru.job4j.tracker.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
        private ArrayList<Person> persons = new ArrayList<Person>();

        public void add(Person person) {
            this.persons.add(person);
        }

        public ArrayList<Person> find(String key) {
            Predicate<Person> predicate = person -> key.contains(person.getAddress());
            Predicate<Person> predicate1 = person -> key.contains(person.getName());
            Predicate<Person> predicate2 = person -> key.contains(person.getSurname());
            Predicate<Person> predicate3 = person -> key.contains(person.getPhone());
            Predicate<Person> combine = predicate.or(predicate1).or(predicate2).or(predicate3);
            ArrayList<Person> result = new ArrayList<>();
            for (Person person : persons) {
                if (combine.test(person)) {
                    result.add(person);
                }
            }
            return result;
        }
    }

