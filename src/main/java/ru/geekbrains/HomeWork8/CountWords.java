package ru.geekbrains.HomeWork8;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CountWords {

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
