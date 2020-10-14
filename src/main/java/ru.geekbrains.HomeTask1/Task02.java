package ru.geekbrains.HomeTask1;

//Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

public class Task02 {

    public static void main(String[] args) {
        numIsPositiveOrNot(-1);
        numIsPositiveOrNot(0);
        numIsPositiveOrNot(1);
    }

    public static void numIsPositiveOrNot(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " положительное!");
        } else {
            System.out.println("Чилос " + a + " отрицательное!");
        }
    }


}
