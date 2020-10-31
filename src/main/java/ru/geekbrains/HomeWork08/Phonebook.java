package ru.geekbrains.HomeWork08;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Phonebook {

    private final Map<String, LinkedList<String>> phonebook = new HashMap<>();

    /**
     * Добавление фамилии и номера телефона. Можно было сделать так, чтобы ключом был номер телефона, но метод ниже
     * показался мне оптимальнее.
     *
     * @param lastName
     * @param telephoneNumber
     */

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

    /**
     * Вывод листа номеров телефона по фамилии.
     *
     * @param lastName
     * @return
     */

    public List<String> get(String lastName) {
        return phonebook.get(lastName);
    }
}
