package ru.geekbrains.HomeWork4;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Human("Человек1", 2, 2000),
                new Human("Человек2", 3, 3000),
                new Cat("Кот1", 8, 50000),
                new Cat("Кот2", 10, 40000),
                new Robot("Робот1", 10, 40000),
                new Robot("Робот2", 10, 40000),
        };
        Object[] obstacles = {
                new Treadmill(1000),
                new Wall(1),
                new Treadmill(2000),
                new Wall(2),
                new Treadmill(3000),
                new Wall(3),
                new Treadmill(4000),
                new Wall(4)
        };

        for (Participant participant : participants) {
            participant.runAndJump(obstacles);
        }
    }
}
