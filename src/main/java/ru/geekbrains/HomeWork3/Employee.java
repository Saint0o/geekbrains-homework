package ru.geekbrains.HomeWork3;

public class Employee {
    private String name;
    private String email;
    private int age;
    private String position;

    public Employee(String name, String email, int age, String position) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }
}
