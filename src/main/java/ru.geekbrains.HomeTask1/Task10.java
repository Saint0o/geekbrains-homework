package ru.geekbrains.HomeTask1;

//* Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

public class Task10 {
    public static void main(String[] args) {
        isLeapYear(2000);
        isLeapYear(2004);
        isLeapYear(2400);
        isLeapYear(1993);
        isLeapYear(1902);
    }

    public static void isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            printLeapYear(year);
        } else {
            printNotLeapYear(year);
        }
    }

    public static void printNotLeapYear(int year) {
        System.out.println(year + " год не високосный");
    }

    public static void printLeapYear(int year) {
        System.out.println(year + " год високосный");
    }

}
