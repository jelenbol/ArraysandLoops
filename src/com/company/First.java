package com.company;

public class First {

    public static void newMethod(int[] myArray) {

    }

    public static void main(String[] args) {

        int[] myArray = {5, 3, 7, 6, 2, 8};

        newMethod(myArray);

        //For loop !!!!!!!!!!!!!!!

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        System.out.println();


        //For each loop !!!!!!!!!!!!!!

        for (int tempvar : myArray) {
            System.out.println(tempvar);
        }

        System.out.println();


        // While loop !!!!!!!!!!!!

        int i = 0;
        while (i < myArray.length) {
            System.out.println(myArray[i]);
            i++;
        }


        // Do while loop


        do {
            System.out.println(myArray[i]);
            i++;
        }

        while (i < myArray.length);


    }
}
