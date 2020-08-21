package ru.job4j.tracker.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        System.out.print("Задайте вопрос.");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String word1;
        if (word.equals(word)){
            int answer = new Random().nextInt(3);
            if (answer == 0){
                word1 = "Да";
            } else if (answer == 1){
                word1 = "Нет";
            } else {
                word1 = "Может быть";
            }
        }
    }
}
