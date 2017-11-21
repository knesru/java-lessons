package com.company;

import java.util.Random;

public class Main {
    private static final int Array_size = 10;

    public static void main(String[] args) {
        int[] arr;
        int tmp;
        arr = new int[Array_size];

        final Random random = new Random();

        for(int i=0; i<Array_size; i++) {
            arr[i] = random.nextInt(100);
        }

        for(int i=0; i<Array_size; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }

        System.out.println(" ");

        for(int i=0; i<Array_size-1; i++){
            for (int j=i+1; j<Array_size; j++){
                if(arr[j]<arr[i]){
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }

        for(int i=0; i<Array_size; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }

    }
}
