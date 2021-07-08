package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");

        int number = scanner.nextInt();

        boolean isPrime = true;
        if( number > 0) {
            if( number == 1 || number == 2 ) {
                isPrime = true;
            }else {
                int i = 2;
                while(i < number) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                    i++;
                }
            }
        }else {
            isPrime = false;
        }

        if(isPrime) {
            System.out.printf(" %d is a prime", number);
        }else {
            System.out.printf(" %d is not a prime", number);
        }
    }
}
