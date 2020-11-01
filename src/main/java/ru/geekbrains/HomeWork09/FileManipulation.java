package ru.geekbrains.HomeWork09;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.stream.Stream;

public class FileManipulation {

    /**
     * Считает, сколько раз повторяется комбинация символов в указанных файлах. Неоьходимо передать строку и файл, в котором будет проводиться поиск.
     * @param s
     * @param file
     * @return
     */

    public static long stringCount(String s, File file) {

        long sum = 0;

        try {
            Scanner reader = new Scanner(new FileReader(file));

            Stream<MatchResult> text = reader.findAll(s);

            sum = text.count();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }

        return sum;
    }

    /**
     * Сшивает все файлы в директории в один. Необходимо передать директорию с файлами и новый файл, в котором все будет сшиваться.
     * @param dir
     * @param newFile
     * @throws IOException
     */

    public static void stapler(File dir, File newFile) throws IOException {

        List<File> files = new LinkedList<>();

        FileWriter writer = new FileWriter(newFile);

        System.out.printf("Файл %sсоздан %n", newFile.createNewFile() ? "не " : "успешно ");

        for (File file : dir.listFiles()) {
            if (!file.isDirectory()) {
                files.add(file);
            }
        }

        for (File file : files) {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String s = reader.readLine();
            writer.write(s + "\n");

            while (s != null) {
                s = reader.readLine();
                if (s != null) writer.write(s + "\n");
            }

        }

        writer.close();

    }

    /**
     * Удаляет директорию. Необходимо передать директорию с файлами.
     * @param dir
     */

    public static void removeDirectory(File dir) {

        try {
            for (File file : dir.listFiles()) {
                if (file.isDirectory()) {
                    removeDirectory(file);
                } else {
                    file.delete();
                }
            }

            dir.delete();

            System.out.printf("Директория %s удалена успешно%n", dir.getName());
        } catch (Exception e) {
            System.out.printf("Директория %s не найдена", dir.getName());
        }
    }

}
