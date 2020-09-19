package ru.job4j.tracker.stream;


import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public static void main(String[] args) {
       Stream.of(Value.values())
               .flatMap(value1 -> Stream.of(Suit.values())
                       .map(suit1 -> new Card(suit1, value1)))
               .collect(Collectors.toList()).forEach(System.out::println);
    }
}
