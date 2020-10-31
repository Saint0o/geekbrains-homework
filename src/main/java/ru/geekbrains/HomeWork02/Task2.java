package ru.geekbrains.HomeWork02;

//Написать реализацию алгоритма сортировки массива методом выбора (selection sort).

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, -4, 11, 4, 5, 2, 4, 8, 9, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            swap(i, minIndex(i, arr), arr);
        }
    }

    public static int minIndex(int a, int[] arr) {
        int minIndex = a;
        int min = arr[a];
        for (int i = a + 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void swap(int a, int b, int[] arr) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
