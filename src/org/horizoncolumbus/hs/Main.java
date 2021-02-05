package org.horizoncolumbus.hs;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //declaring the array and initializing
        int[] number = new int[5];

        // Array Literal
        // int[] numbers = new int[] {1, 2, 3, 4, 5};
  //          numbers[0] = 1;
  //          numbers[1] = 2;
  //          numbers[2] = 3;
  //          numbers[3] = 4;
  //          numbers[4] = 5;*/
        //number [5] = 6; (Index 5 out of bounds for length 5)
        // Add data to the Array
        for(int i = 0; i < 5; i++){
            number[i] = i + 1;
        }
        int sum = 0;

        for(int i = 1; i < 5; i++){
            sum = sum + number[i];
        }
        //sum all the numbers in the array
        System.out.println(number[2]);
    }
}
