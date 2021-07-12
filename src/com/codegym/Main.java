package com.codegym;

public class Main {
    public static boolean isPrime(int number) {
        if( number > 0) {
            if( number == 1 || number == 2 ) {
                return true;
            }else {
                int i = 2;
                while(i < number) {
                    if (number % i == 0) {
                        return false;
                    }
                    i++;
                }
            }
        }else {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        for(int number = 2; number <= 100; number++) {
            boolean isPrime = isPrime(number);
            if(isPrime) {
                System.out.printf(" %d is a prime \n", number);
            }
        }

    }
}
