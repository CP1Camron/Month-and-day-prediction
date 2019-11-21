package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        String day;
        String month;
        String year;

        System.out.println("There's a nursery rhyme that goes like...");

        System.out.println("Monday's child is fair of face, ");
        System.out.println("Tuesday's child is full of grace,");
        System.out.println("Wednesday's child is full of woe,");
        System.out.println("Thursday's child has far to go");
        System.out.println("Friday's child is loving and giving,");
        System.out.println("Saturday's child works hard for a living,");
        System.out.println("But the child born on the sabbath day,");
        System.out.println("Is fair and wise and good in every way.");

        System.out.println("What is the day you were born?(The number)");
        day = keyboard.nextLine();

        System.out.println("What was the month you were born");
        month = keyboard.nextLine();

        System.out.println("And finally what year were you born");
        year = keyboard.nextLine();

        System.out.print("So you were born "+month);
        System.out.print("/"+day);
        System.out.print("/"+year);
    }
    public static int month(int month, int day, int year){

        switch(month){
            case 1:
                return 2;
            case 3:
                return 4;
            case 5:
                return 6;
            case 7:
                return 8:

        }
    }
}
