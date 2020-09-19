package ru.job4j.tracker.stream;


import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public static void main(String[] args) {
       Random r = new Random();
       Value v = Stream.of(Value.values()).skip(r.nextInt()).findFirst().orElse(null);
       Suit s = Stream.of(Suit.values()).skip(r.nextInt()).findFirst().orElse(null);
       Card card = new Card(s,v);
    }
}
