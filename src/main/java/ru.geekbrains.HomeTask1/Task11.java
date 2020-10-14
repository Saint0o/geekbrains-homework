package ru.geekbrains.HomeTask1;

//* Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
// если в массиве есть место, в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.


public class Task11 {
    public static void main(String[] args) {
        int[] arrayInt = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(arrayInt));
    }

    public static boolean checkBalance(int[] arrayInt) {
        int rSum = sum(arrayInt, 1, arrayInt.length);
        int lSum = arrayInt[0];

        for (int i = 1; i < arrayInt.length; i++) {
            if (lSum < rSum) {
                lSum = lSum + arrayInt[i];
                rSum = rSum - arrayInt[i];
            }
        }
        return (rSum == lSum);
    }

    public static int sum(int[] ArrayInt, int begin, int end) {
        int sum = 0;
        for (int i = begin; i < end; i++) {
            sum = sum + ArrayInt[i];
        }
        return sum;
    }
}
