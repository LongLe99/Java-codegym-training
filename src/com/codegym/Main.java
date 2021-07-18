package com.codegym;

import java.util.Scanner;

public class Main {
    public static void printArray(int[] array){
		for (int i : array) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	public static void reverseArray(int[] array){
    	for (int i = 0; i < array.length / 2; i++) {
    		int placeToReverse = array.length - 1 - i;
    		int temp = array[i];
    		array[i] = array[placeToReverse];
			array[placeToReverse] = temp;
		}

    	printArray(array);
	}

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	int size;
	int[] array;

	do {
	    System.out.print("Enter a size:");
	    size = scanner.nextInt();
	    if(size > 20){
            System.out.print("Size cannot exceed 20");
        }
    }while(size > 20);

	array = new int[size];

	for(int i = 0; i < array.length; i++){
	    System.out.print("Enter element " + (i + 1)+ ": ");
        array[i] = scanner.nextInt();
	}

	printArray(array);

	reverseArray(array);



    }
}
