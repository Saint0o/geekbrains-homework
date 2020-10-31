package ru.geekbrains.HomeWork01;

//Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

public class Task01 {

    public static void main(String[] args) {
        System.out.println(isNumberInRange(10, 20));
        System.out.println(isNumberInRange(3, 4));
        System.out.println(isNumberInRange(5, 7));
    }

    public static boolean isNumberInRange(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    }


}
