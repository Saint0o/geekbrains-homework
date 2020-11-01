package ru.geekbrains.HomeWork09;

import java.io.File;
import java.io.IOException;

import static ru.geekbrains.HomeWork09.FileManipulation.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File task1 = new File("src/main/resources/Task1");
        File task2 = new File("src/main/resources/Task2");
        File task3 = new File("src/main/resources/Task3");
        File dir = new File("src/main/resources");

        System.out.println(stringCount("то", task1));
        System.out.println(stringCount("то", task2));
        System.out.println(stringCount("то", task3));

        stapler(dir, new File("target/newFile.txt"));

        File removeDir = new File("src/main/TestDir");

        removeDirectory(removeDir);
    }
}
