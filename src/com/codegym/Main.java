package com.codegym;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void printArray(Integer[] array) {
		for (int i : array) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	public static void removeElement (int index, Integer[] array) {
    	for (int j = index; j < array.length - 1; j++) {
    		if(j == array.length - 2) {
    			int temp = array[j+1];
    			System.out.print(temp);
    			array[j+1] = 0;
				array[j] = temp;
				break;
    		}
    		array[j] = array[j+1];
    	}
	}

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	int element;
	Integer[] array = new Integer[40];
	for (int i = 0; i < 40; i++) {
		array[i] = i + 15;
	}

	do {
		System.out.print("Enter the value you want to remove:");
		element = scanner.nextInt();
	}while(element < 0);

	printArray(array);

	int index = Arrays.asList(array).indexOf(element);
	System.out.println(index);
	System.out.printf("%d is at %d \n", element, index);

	removeElement(index, array);
	printArray(array);
    }


}
