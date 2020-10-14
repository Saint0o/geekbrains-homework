package ru.geekbrains.HomeTask1;

//Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное.

public class Task03 {

    public static void main(String[] args) {
        System.out.println(numIsNegative(-1));
        System.out.println(numIsNegative(0));
        System.out.println(numIsNegative(1));
    }

    public static boolean numIsNegative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
}
