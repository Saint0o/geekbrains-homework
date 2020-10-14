package ru.geekbrains.HomeTask1;

//Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

public class Task08 {
    public static void main(String[] args) {
        int[][] squareArrayInt = new int[10][10];
        for (int i = 0; i < squareArrayInt.length; i++) {
            for (int j = 0; j < squareArrayInt.length; j++) {
                if (i == j) squareArrayInt[i][j] = 1;
                System.out.print(squareArrayInt[i][j] + " ");
            }
            System.out.println();
        }
    }
}
