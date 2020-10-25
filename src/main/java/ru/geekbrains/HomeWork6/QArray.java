package ru.geekbrains.HomeWork6;

public class QArray {

    public static void squareArrayElementsSum(String[][] array) {
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
                        throw new MyArrayDataException(j + 1, i + 1); //индекс положения ячейки в массиве начинается с 1
                    }
                } else {
                    throw new MyArraySizeException(row, columns, rowAndColumnsExpected);
                }
            }
        }
        System.out.println(sum);
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
            squareArrayElementsSum(array);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            squareArrayElementsSum(sizeExceptionArray);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            squareArrayElementsSum(dataExceptionArray);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }


}
