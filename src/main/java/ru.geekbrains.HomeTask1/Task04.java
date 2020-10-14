package ru.geekbrains.HomeTask1;

//Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

public class Task04 {

    public static void main(String[] args) {
        hello("Хозяин");
    }

    public static void hello(String name) {
        System.out.println("Привет, " + name + "!");
    }

}
