package ru.geekbrains.HomeWork02;

//Написать метод, который переворачивает содержимое массива так, что на первом месте оказывается последний элемент и т.д.

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        arrReverse(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr1 = {1, 2, 3, 4, 5};
        arrReverse(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    public static void arrReverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
    }
}
