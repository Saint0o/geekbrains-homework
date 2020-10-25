package ru.geekbrains.HomeWork6;

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException(int row, int columns, int rowAndColumnsExpected) {
        super("Массив " + columns + "x" + row + ", а должен быть " + rowAndColumnsExpected + "x" + rowAndColumnsExpected);
    }


}
