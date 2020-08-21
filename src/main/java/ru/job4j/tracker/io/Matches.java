package ru.job4j.tracker.io;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int matches = 11;
        int turn = 0;
        System.out.println("Игра началась. Брать можно максимум три спички");
        while(matches > 1){
            Scanner inpit = new Scanner(System.in);
            String take = inpit.nextLine();
            int num = Integer.valueOf(take);
                if (num <= 3) {
                    matches = matches - num;
                    turn++;
                    System.out.println("осталось " + matches + " спичек");
                    if (turn%2 != 0){
                        System.out.println("Ходит игрок два");
                    } else {
                        System.out.println("Ходит игрок один");
                    }
                } else {
                    System.out.println("Можно максимум три!");
                }
        }
        System.out.println("Игра окончена");
        if (turn%2 == 0){
            System.out.println("Победил игрок два");
        } else {
            System.out.println("Победил игрок один");
        }


    }
}
