package ru.geekbrains.HomeWork01;

//Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 2 5 8 11 14 17 20 23;

public class Task06 {
    public static void main(String[] args) {
        int[] arrayInt = new int[8];
        int num = 2;
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = num;
            num += 3;
            System.out.print(arrayInt[i] + " ");
        }

    }

}
