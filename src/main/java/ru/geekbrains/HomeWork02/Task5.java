package ru.geekbrains.HomeWork02;

// *Написать метод, которая получает на вход массив и перемешивает его элементы случайным образом. Для генерации случайного целого числа используйте класс Random.

import java.util.Arrays;
import java.util.Random;

public class Task5 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        mixer(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mixer(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randIndex = random.nextInt(arr.length);
            int tmp = arr[i];
            arr[i] = arr[randIndex];
            arr[randIndex] = tmp;
        }
    }
}
