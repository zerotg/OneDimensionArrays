package org.horizoncolumbus.hs;

public class HW17 {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        for(int i = 0; i < 5; i++){
            numbers[i] = i + 1;
        }
        int sum = 0;

         for(int i = 0; i < 5; i++){
             sum = sum + numbers[i];
         }

         for(int i = 0; i < 5; i++){
             if(i==4){
                 System.out.println(numbers[i] + " = " + sum);
             }
             else{
                 System.out.print(numbers[i] + " + ");
             }
         }
    }}

