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


        System.out.print("Task 6 Create an array and fill it. Print count of elements which can be divided by 2.");
        int [] masiv = {4, 6, 8,10,20,5,7,1};
        int count = 0;
        for (int i = 0; i < masiv.length; i++) {
            if (masiv[i] % 2 == 0) {
                count++;
            }
            System.out.print(array[i]);
        }
        System.out.print("TASK 5 Create an array and fill it. Print all elements which are between 24.12 and 467.23.");
        float[]array6 ={25,2f, 29.52f ,467.23f,17,24.20f,427.90f, 46.9f, 22.3f, 123.4f };
        for (int j = 0; j < array6.length ; j++) {
            if (array6[j] > 24.12 &&  array6[j] < 467.23){
               System.out.println(array6[j]);
            }
        }
        System.out.print("Task 3 Create an array and fill it with odd numbers from -20:20");
        int[] array3 = new int[20];
        int x = -19;
        for (int i = 0; i < array3.length; i++) {
          array3[i]= x;
          x=x+2;
          System.out.println(array3[i]);
        }
        System.out.print("Task 7 Given an integer, 0< N < 21 , print its first\n" +
                "10 multiples.\n" +
                "\n" +
                "Each multiple N x i (where 0<i<11)\n" +
                "should be printed on a new line in the\n" +
                "form: N x i = result.");
        int y = 2;
        for (int i = 1; i<=10; i++) {
            int z = i * y;
            System.out.println(y+ " * " + i + " = " + z);
        }
    }
}
