package ru.geekbrains.HomeWork3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        start(true);
    }

    public static void start(boolean start) throws IOException {
        Group group = new Group("группа самых лучших людей на свете");
        Group group1 = new Group("группа самых лучших людей на свете111");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (start) {
            String s = br.readLine();
            switch (s) {
                case "addEmp":
                    System.out.print("Введите имя сотрудника: ");
                    String name = br.readLine();
                    System.out.print("Введите email сотрудника: ");
                    String email = br.readLine();
                    System.out.print("Введите возраст сотрудника: ");
                    int age = Integer.parseInt(br.readLine());
                    System.out.print("Введите должность сотрудника: ");
                    String position = br.readLine();
                    group.addEmployee(new Employee(name, email, age, position));
                    group1.addEmployee(new Employee(name, email, age, position));
                    break;
                case "removeEmp":
                    System.out.println("Введите индекс сотрудника: ");
                    int index = Integer.parseInt(br.readLine());
                    group.removeEmployee(index);
                    group1.removeEmployee(index);
                    break;
                case "cleanGr":
                    group.cleanGroup();
                    group1.cleanGroup();
                    break;
                case "empInfo":
                    group.printEmployeesInfo();
                    group1.printEmployeesInfo();
                    break;
                case "exit":
                    start = false;
                    break;
                default:
                    System.out.println("Неизвестный запрос");
                    break;
            }
        }
    }
}
