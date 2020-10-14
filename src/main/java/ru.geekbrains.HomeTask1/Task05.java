package ru.geekbrains.HomeTask1;

//Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

public class Task05 {
    public static void main(String[] args) {
        int[] arrayInt = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == 1) {
                arrayInt[i] = 0;
            } else {
                arrayInt[i] = 1;
            }

            System.out.print(arrayInt[i] + " ");
        }
    }
}
