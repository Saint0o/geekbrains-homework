package ru.geekbrains.HomeWork12;

import java.util.Arrays;

public class Main {

    static String str = "Взять строку состоящую из 100 слов разделенных пробелом получить список слов длиннее 5 символов и " +
            "склеить их в одну строку с пробелом в качестве разделителя Найти список уникальных слов в двумерном массиве " +
            "размером 5х5 Посчитать сумму четных чисел в пределах от 100 до 200 (включительно) Посчитать суммарную длину " +
            "строк в одномерном массиве Из массива слов получить первые три слова в алфавитном порядке Посчитать суммарную " +
            "длину строк в одномерном массиве Из массива слов получить первые три слова в алфавитном порядке Посчитать " +
            "суммарную длину строк в одномерном массиве Из массива слов получить первые три слова в алфавитном порядке " +
            "три слова в алфавитном";

    static String str1 = "привет как дела б в а";

    static String[][] qArray = {
            {"s", "st", "str", "stri", "string"},
            {"s1", "st1", "str1", "stri1", "string1"},
            {"s2", "st2", "stri1", "stri2", "string2"},
            {"s3", "st3", "str3", "stri3", "string3"},
            {"s4", "st3", "str4", "stri4", "string4"},
    };

    public static void main(String[] args) {
        System.out.println(StreamAPI.lengthMoreFiveWords(str));

        System.out.println(StreamAPI.uniqueWordsInSquareArray(qArray));

        System.out.println(StreamAPI.evenNumSum(100, 200));

        System.out.println(StreamAPI.lengthSumAllStrings(str.split(" ")));

        System.out.println(Arrays.toString(StreamAPI.firstThreeWords(str1.split(" "))));
    }
}
