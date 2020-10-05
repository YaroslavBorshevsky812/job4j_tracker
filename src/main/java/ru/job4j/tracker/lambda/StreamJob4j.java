package ru.job4j.tracker.lambda;

import java.lang.reflect.Array;
import java.security.KeyStore;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


import java.util.stream.Stream;

public class StreamJob4j {

    private Predicate<String> filter;
    private List<String> list;


    public static StreamJob4j of(List<String> list){
        return new Builder()
                .withList(list)
                .build();
    }
    public StreamJob4j filter (Predicate<String> filter){
        return new Builder()
                .withList(list)
                .withPredicate(filter)
                .build();
    }
    public List<String> collect(List<String> list) {
        for (String s : list) {
            if (filter.test(s)) {
                list.add(s);
            }
        }
        return list;
    }

    public static class Builder {
        private Predicate<String> filter;
        private List<String> list;
        private StreamJob4j newStreamJob4j;

        private Builder(){
            newStreamJob4j = new StreamJob4j();
        }

        public Builder withPredicate (Predicate<String> predicate){
            newStreamJob4j.filter = predicate;
            return this;
        }
        public Builder withList (List<String> list){
            newStreamJob4j.list = list;
            return this;
        }
        public StreamJob4j build(){
            return newStreamJob4j;
        }
    }
}
