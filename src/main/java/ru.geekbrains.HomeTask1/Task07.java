package ru.geekbrains.HomeTask1;

//Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

public class Task07 {
    public static void main(String[] args) {
        int[] arrayInt = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] < 6) {
                arrayInt[i] *= 2;
            }

            System.out.print(arrayInt[i] + " ");
        }
    }
}
