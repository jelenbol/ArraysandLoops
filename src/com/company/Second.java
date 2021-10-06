package com.company;

public class Second {
    public static void main(String[] args) {

        // negative elements

        int[] myArray = {10, 4, -4, 7, 0, 9, 1, 3, 7, -5};

        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.println(myArray[i]);
        }
    }
}
