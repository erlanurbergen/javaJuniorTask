package com.company;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)  {
//        System.out.println(compare(new int[]{1, 4}, new int[]{1, 3}));
        System.out.println(Arrays.toString(filterArray(new int[]{10, 3, 4, 5, 9, 12})));



    }

    // Задание 1(Массивы)
    private static boolean compare(int arr[], int arr2[]) {
        int count = 0;
        if (arr.length == arr2.length) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == arr2[i]) {
                    count++;
                }
            }
            if (count == arr.length)
                return true;
            else
                return false;
        }
        return false;
    }

    // Задание 2(Массивы)
    private static Integer[] filterArray(int arr[]){
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] % 3 == 0){
                nums.add(arr[i] * 10);
            }
        }
        Integer[] array = nums.toArray(new Integer[0]);

        return array;

    }


    // Задание 1(Функции)
    private static int[] quadraticeQuationSolve(int a, int b, int c) {
        int quadraticeQuationSolve = (int)(Math.pow(b, 2)) - (4 * a * c);

        if (quadraticeQuationSolve < 0) {
            return new int[]{};
        }

        if (quadraticeQuationSolve == 0) {
            int rootOfTheEquation = -b/2 * a;
            return new int[]{rootOfTheEquation};
        }

       else {
           // (-b + Math.sqrt(d) )/(2*a) и (-b - Math.sqrt(d) )/(2*a)
            return new int[]{(-b + (int)(Math.sqrt(quadraticeQuationSolve)) / 2*a), (-b + (int)(Math.sqrt(quadraticeQuationSolve)))};
        }
    }
}
