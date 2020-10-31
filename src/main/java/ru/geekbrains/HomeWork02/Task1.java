package ru.geekbrains.HomeWork02;

//Написать программу, которая выводит на экран равнобедренный треугольник из звездочек. Ширина основания - любое нечетное число. Начинать вывод с вершины.

public class Task1 {
    public static void main(String[] args) {
        printTriangle(51);
    }

    public static void printTriangle(int width) {
        if (width % 2 == 0) {
            System.out.println("Введите нечетное значение ширины!");
        } else {
            for (int i = 0; i <= width / 2 + 1; i++) {
                for (int j = 0; j <= width / 2 - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i * 2 - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
