package ru.geekbrains.HomeTask1;

//Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

import java.util.Arrays;

public class Task05 {
    public static void main(String[] args) {
        int[] arrayInt = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invert(arrayInt);
        System.out.println(Arrays.toString(arrayInt));

    }

    public static void invert(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 1 ? 0 : 1;
        }
    }
}
