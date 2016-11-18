package com.company;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        System.out.println(arr[3]);
        }

     static int[] modArray(int[] arr )
    {
        for (int i=0;i<arr.length;i++) {
            arr[i]*=2;

        }
        return arr;
        System.out.println(modArray());
    }
    }
