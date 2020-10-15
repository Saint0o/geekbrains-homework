package ru.geekbrains.HomeWork2;

//Написать метод, который в качестве параметра получает число секунд в виде целого числа и преобразует его в строку
// вида чч:мм:сс, где чч - кол-во часов, мм - количество минут, сс - количество секунд в исходном значении. Подсказка -
// использовать операцию деления (/) и остатка от деления (%). Примеры 62 - "00:01:02", 130 - "00:02:10", 3750 - "01:02:30"

public class Task3 {
    public static void main(String[] args) {
        System.out.println(timeFormat(62));
        System.out.println(timeFormat(130));
        System.out.println(timeFormat(3750));
    }

    public static String timeFormat(int seconds) {
        int sec = seconds % 60;
        int minutes = seconds / 60 % 60;
        int hours = seconds / 60 / 60;

        return plusZero(hours) + ":" + plusZero(minutes) + ":" + plusZero(sec);
    }

    public static String plusZero(int a) {
        if (a < 10) {
            return "0" + a;
        }
        return a + "";
    }
}
