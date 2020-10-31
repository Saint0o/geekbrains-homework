package ru.geekbrains.HomeWork08;

import java.util.ArrayList;

import static ru.geekbrains.HomeWork08.CountWords.countWords;
import static ru.geekbrains.HomeWork08.CountWords.uniqueWordsList;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n<---------------------Счетчик одинаковых слов-------------------------->\n");

// Задание с подсчетом количества одинаковых слов.

        ArrayList<String> words = new ArrayList<>();
        words.add("привет");
        words.add("привет");
        words.add("один");
        words.add("два");
        words.add("два");
        words.add("три");
        words.add("три");
        words.add("три");
        words.add("1");
        words.add("1");
        words.add("1");
        words.add("1");
        words.add("1");
        words.add("1");
        words.add("одифыдофад");
        words.add("одифыдофадвы");
        words.add("одифыдофадвывывф");

        System.out.println(countWords(words));

        System.out.println(uniqueWordsList(words));

        System.out.println("\n<---------------------Телефонный справочник---------------------------->\n");


// Задание с телефонным справочником.

        Phonebook phonebook = new Phonebook();
        phonebook.add("Пупкин", "88005553535");
        phonebook.add("Пупкин", "88005553535");
        phonebook.add("Пупкин", "88005253535");
        phonebook.add("Пупкин", "88005253535");
        phonebook.add("Пупкин", "88005553535");
        phonebook.add("Пупкин", "88005553535");
        phonebook.add("Ноунейм", "99999999999");
        phonebook.add("Ноунейм", "92999999999");
        phonebook.add("Ноунейм", "92999999999");

        System.out.println(phonebook.get("Пупкин"));
        System.out.println(phonebook.get("Ноунейм"));
    }
}
