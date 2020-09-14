package ru.job4j.tracker.lambda;

import java.util.Comparator;

public class LambdaString {

    Comparator<Attachment> comparator = (left, right) -> {
        System.out.println("compare - " + left.getSize() + " : " + right.getSize());
        return left.getSize() - right.getSize();
    };

    Comparator<Attachment> comparatorStrings = (left, right) -> {
        System.out.println("compare - " + " " + left.getName() + " " + right.getName());
        return right.getName().compareTo(left.getName());
    };

}
