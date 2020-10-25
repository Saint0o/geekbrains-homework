package ru.geekbrains.HomeWork6;

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException(int row, int columns, int rowAndColumnsExpected) {
        super("Массив " + row + "x" + columns + ", а должен быть " + rowAndColumnsExpected + "x" + rowAndColumnsExpected);
    }


}
