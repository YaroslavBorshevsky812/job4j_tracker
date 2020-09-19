package ru.job4j.tracker.search;

import java.util.ArrayList;

    public class PhoneDictionary {
        private ArrayList<Person> persons = new ArrayList<Person>();

        public void add(Person person) {
            this.persons.add(person);
        }

        public ArrayList<Person> find(String key) {
            ArrayList<Person> result = new ArrayList<>();

            for (var person : persons) {
                if (key.contains(person.getAddress())
                        ||key.contains(person.getName())
                        ||key.contains(person.getSurname())
                        ||key.contains(person.getPhone())){
                    result.add(person);
                };
            }
            return result;
        }
    }

