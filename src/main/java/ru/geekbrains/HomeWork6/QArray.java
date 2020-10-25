package ru.geekbrains.HomeWork6;

public class QArray {

    public static int squareArrayElementsSum(String[][] array) {
        int sum = 0;
        int row = array.length;
        int columns = array[0].length;
        final int rowAndColumnsExpected = 4;
        if (row == rowAndColumnsExpected && columns == rowAndColumnsExpected) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    try {
                        sum += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(j + 1, i + 1);
                    }
                }
            }
            return sum;
        } else {
            throw new MyArraySizeException(row, columns, rowAndColumnsExpected);
        }
    }

    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "7"}
        };

        String[][] sizeExceptionArray = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        String[][] dataExceptionArray = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "s", "3", "2"}
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
