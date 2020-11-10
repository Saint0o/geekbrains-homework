package ru.geekbrains.HomeWork12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

    /**
     * Взять строку, состоящую из 100 слов разделенных пробелом, получить список слов длиннее 5 символов,
     * и склеить их в одну строку с пробелом в качестве разделителя
     */
    public static String lengthMoreFiveWords(String str) {
        return Stream.of(str.split(" "))
                .filter(s -> s.length() > 5)
                .collect(Collectors.joining(" "));
    }

    /**
     * Найти список уникальных слов в двумерном массиве размером 5х5
     */
    public static List<String> uniqueWords(String[][] arr) {
        return Arrays.stream(arr)
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
    }

    /**
     * Посчитать сумму четных чисел в пределах от 100 до 200 (включительно)
     */
    public static int sumEvenNums(int a, int b) {
        return Stream.iterate(a, n -> n + 1)
                .limit(b - a + 1)
                .filter(x -> x % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    /**
     * Посчитать суммарную длину строк в одномерном массиве
     */
    public static int lengthAllStrings(String[] arr) {
        return Arrays.stream(arr)
                .mapToInt(String::length)
                .sum();
    }

    /**
     * Из массива слов получить первые три слова в алфавитном порядке
     */
    public static List<String> firstThreeWords(String[] arr) {
        return Arrays.stream(arr).sorted(String::compareTo).limit(3).collect(Collectors.toList());
    }

}
