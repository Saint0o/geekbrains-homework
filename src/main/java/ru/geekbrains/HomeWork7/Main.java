package ru.geekbrains.HomeWork7;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        System.out.println(appleBox.getWeight());

        appleBox.putFruit(new Apple()); // добавить яблоко в коробку 1
        appleBox.putFruit(new Apple()); // добавить яблоко в коробку 1
        appleBox.putFruit(new Apple()); // добавить яблоко в коробку 1
        appleBox.putFruit(new Apple()); // добавить яблоко в коробку 1

        System.out.println("Вес первой коробки с яблоками - " + appleBox.getWeight());

        appleBox2.putFruit(new Apple()); // добавить яблоко в коробку 2
        appleBox2.putFruit(new Apple()); // добавить яблоко в коробку 2
        appleBox2.putFruit(new Apple()); // добавить яблоко в коробку 2

        System.out.printf("Вес второй коробки%s равен весу первой %n", appleBox2.compare(appleBox) ? "" : " не");

        appleBox2.putFruit(new Apple()); // добавить яблоко в коробку 2

        System.out.printf("Вес второй коробки%s равен весу первой %n", appleBox2.compare(appleBox) ? "" : " не");

        appleBox.putAllFruitsFromThisBoxToAnother(appleBox2); //положить все фрукты из бокса 1 в бокс 2

        System.out.println("Вес первой коробки с яблоками - " + appleBox.getWeight());

        System.out.println("Вес второй коробки с яблоками - " + appleBox2.getWeight());

        orangeBox.putFruit(new Orange()); // добавить апельсинку в коробку 1
        orangeBox.putFruit(new Orange()); // добавить апельсинку в коробку 1
        orangeBox.putFruit(new Orange()); // добавить апельсинку в коробку 1
        orangeBox.putFruit(new Orange()); // добавить апельсинку в коробку 1

        System.out.println("Вес коробки с апельсинами - " + orangeBox.getWeight());

        System.out.printf("Вес второй коробки с яблоками%s равен весу коробки с апельсинами%n", appleBox2.compare(orangeBox) ? "" : " не");


    }
}
