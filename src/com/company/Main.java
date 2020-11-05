package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.print("Task 1 Create an array and fill it with 2 number.");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2;

            System.out.println(array[i]);
        }

        System.out.print(" Task 2 Create an array and fill it with numbers from 1:1000.");
        int[] array1 = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i]);
        }
        System.out.print(" Task 4 Create an array and fill it. Print all elements which can be divided by 5.");
        int[]array5 = {25, 50, 10, 7, 32, 100};
        for (int i = 0; i <array5.length ; i++) {
            if(array[i]%5==0);
            System.out.print(array5[i] +" ");
        }


        System.out.print("Task 6 Create an array and fill it. Print count of elements which can be divided by 2.")
        int [] masiv = {4, 6, 8,10,20,5,7,1};
        int count = 0;
        for (int i = 0; i < masiv.length; i++){
            if(masiv [i] % 2==0) {
                count++;
            }
            System.out.print(array[i]);




    }
}
