package ru.geekbrains.HomeWork8;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Пупкин", "88005553535");
        phonebook.add("Пупкин", "88005553535");
        phonebook.add("Пупкин", "88005253535");
        phonebook.add("Пупкин", "88005253535");
        phonebook.add("Пупкин", "88005553535");
        phonebook.add("Пупкин", "88005553535");
        phonebook.add("Ноунейм","99999999999");
        phonebook.add("Ноунейм","92999999999");
        phonebook.add("Ноунейм","92999999999");

        System.out.println(phonebook.get("Пупкин"));
        System.out.println(phonebook.get("Ноунейм"));
    }
}
