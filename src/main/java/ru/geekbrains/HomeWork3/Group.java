package ru.geekbrains.HomeWork3;

import java.util.Arrays;

public class Group {
    private Employee[] employees = new Employee[10];
    private int empCount = 0;
    private String gName;

    public Group(String gName) {
        this.gName = gName;
    }

    public String getGName(){
        return gName;
    }

    public void addEmployee(Employee employee) {
        if (empCount < employees.length) {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] == null) {
                    employees[i] = employee;
                    empCount++;
                    break;
                }
            }
        } else System.out.println("Группа заполнена!");
    }

    public void removeEmployee(int i) {
        if (employees[i] == null) {
            System.out.println("Такого сотрудника не существует!");
        } else {
            employees[i] = null;
            empCount--;
        }
    }

    public void cleanGroup() {
        Arrays.fill(employees, null);
        empCount = 0;
    }

    public void printEmployeesInfo() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println("|-----------|-------------------------------");
                System.out.println("|ID:        | " + i);
                System.out.println("|Имя:       | " + employees[i].getName());
                System.out.println("|Email:     | " + employees[i].getEmail());
                System.out.println("|Возраст:   | " + employees[i].getAge());
                System.out.println("|Должность: | " + employees[i].getPosition());
                System.out.println("|Группа:    | " + this.getGName());
            }
        }
    }
}