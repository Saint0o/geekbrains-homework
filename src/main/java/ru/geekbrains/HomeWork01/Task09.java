package ru.geekbrains.HomeWork01;

//* Задать одномерный массив и найти в нем минимальный и максимальный элементы;

public class Task09 {
    public static void main(String[] args) {
        int[] arrayInt = {1, 5, 3, -4, 11, 4, 5, 2, 4, 8, 9, 1};

        int min = arrayInt[0];
        int max = arrayInt[0];

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] > max) {
                max = arrayInt[i];
            }
            if (arrayInt[i] < min) {
                min = arrayInt[i];
            }
        }
        System.out.println("Максимальный элемент = " + max);
        System.out.println("Минимальный элемент = " + min);
    }
}
