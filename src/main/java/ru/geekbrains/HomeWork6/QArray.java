package ru.geekbrains.HomeWork6;

public class QArray {

    public static int squareArrayElementsSum(String[][] array) {
        int sum = 0;
        int row = array.length;
        final int rowAndColumnsExpected = 4;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int columns = array[i].length;
                if (columns == rowAndColumnsExpected && row == rowAndColumnsExpected) {
                    try {
                        sum += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(j + 1, 4 - i); //индекс положения ячейки в массиве начинается с 1
                    }
                } else {
                    throw new MyArraySizeException(row, columns, rowAndColumnsExpected);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "7"}
        };

        String[][] sizeExceptionArray = {
                {"1", "2", "3"},
                {"1", "2", "3"},
                {"1", "2", "3"}
        };

        String[][] dataExceptionArray = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "s", "3", "4"},
                {"1", "1", "3", "2"}
        };

        try {
            System.out.println(squareArrayElementsSum(array));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println(squareArrayElementsSum(sizeExceptionArray));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(squareArrayElementsSum(dataExceptionArray));
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }


}
