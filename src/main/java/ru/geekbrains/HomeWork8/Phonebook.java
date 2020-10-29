package ru.geekbrains.HomeWork8;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Phonebook {

    private final Map<String, LinkedList<String>> phonebook = new HashMap<>();

    public void add(String lastName, String telephoneNumber) {

        LinkedList<String> phoneList = new LinkedList<>();

        if (phonebook.containsKey(lastName)) {
            phoneList = phonebook.get(lastName);
        }

        if ((phonebook.get(lastName) != null && !phonebook.get(lastName).contains(telephoneNumber)) || phonebook.get(lastName) == null) {
            phoneList.add(telephoneNumber);
        }

        phonebook.put(lastName, phoneList);

    }

    public LinkedList<String> get(String lastName) {
        return phonebook.get(lastName);
    }
}
