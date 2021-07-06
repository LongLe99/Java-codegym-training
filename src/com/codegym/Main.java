package com.codegym;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year;

        System.out.println("Enter a year: ");
        year = scanner.nextInt();

        boolean isLeapYear = false;
        boolean isDevisibleBy4 = year % 4 == 0;
        if (isDevisibleBy4) {
            boolean isDevisibleBy100 = year % 100 == 0;
            if (isDevisibleBy100) {
                boolean isDevisibleBy400 = year % 400 == 0;
               if (isDevisibleBy400) {
                   isLeapYear = true;
               }
            }else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.printf("%d is leap year", year);
        }else {
            System.out.printf("%d is not leap year", year);
        }
    }
}
