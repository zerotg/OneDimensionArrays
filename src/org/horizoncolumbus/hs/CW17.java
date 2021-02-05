package org.horizoncolumbus.hs;

import java.util.Scanner;

public class CW17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter Array[" + i + "]: ");
            numbers[i] = input.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += numbers[i];
        }

        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i]);
            if (i < size - 1)
                System.out.print(" + ");
            if (i == size - 1)
                System.out.print(" = " + sum);
        }
    }
}
