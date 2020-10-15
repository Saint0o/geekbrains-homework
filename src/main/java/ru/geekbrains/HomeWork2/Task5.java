package ru.geekbrains.HomeWork2;

// *Написать метод, которая получает на вход массив и перемешивает его элементы случайным образом. Для генерации случайного целого числа используйте класс Random.

import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        mixer(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mixer(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int randIndex = (int) (Math.random() * arr.length);
            int tmp = arr[i];
            arr[i] = arr[randIndex];
            arr[randIndex] = tmp;
        }
    }
}
