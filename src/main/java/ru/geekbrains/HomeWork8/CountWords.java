package ru.geekbrains.HomeWork8;

import java.util.*;

public class CountWords {
    public static void main(String[] args) {
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
    }

    /**
     * Вывод уникальных слов (котрые встречаются один раз)
     */
    public static List<String> uniqueWordsList(List<String> words) {

        HashMap<String, Integer> wordsAndCounts = countWords(words);

        LinkedList<String> uniqueWords = new LinkedList<>();

        for (Map.Entry<String, Integer> word : wordsAndCounts.entrySet()) {
            if (word.getValue() == 1) {
                uniqueWords.add(word.getKey());
            }
        }

        return uniqueWords;
    }

    /**
     * Вывод слов без дубликатов и подсчет количества слов
     */

    public static HashMap<String, Integer> countWords(List<String> words) {

        HashMap<String, Integer> result = new HashMap<>();

        for (String key : words) {
            if (result.containsKey(key)) {
                result.put(key, result.get(key) + 1);
            } else {
                result.put(key, 1);
            }
        }

        return result;
    }
}
