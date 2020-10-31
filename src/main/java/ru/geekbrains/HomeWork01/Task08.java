package ru.geekbrains.HomeWork01;

//Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

import java.util.Arrays;

public class Task08 {
    public static void main(String[] args) {
        int[][] squareArrayInt = new int[10][10];
        fillDiags(squareArrayInt);
        for (int[] line : squareArrayInt) {
            System.out.println(Arrays.toString(line));
        }
    }

    public static void fillDiags(int[][] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            intArr[i][i] = 1;
            intArr[i][intArr.length - i - 1] = 1;
        }
    }
}

