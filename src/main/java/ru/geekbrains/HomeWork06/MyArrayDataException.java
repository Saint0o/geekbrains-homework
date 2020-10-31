package ru.geekbrains.HomeWork06;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(int x, int y) {
        super("Некорректные данные в ячейке [" + x + "," + y + "]");
    }
}
