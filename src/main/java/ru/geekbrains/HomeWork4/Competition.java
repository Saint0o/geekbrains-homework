package ru.geekbrains.HomeWork4;

public class Competition {
    private final Participant[] participants;

    private final Obstacle[] obstacles;

    public Competition(Participant[] participants, Obstacle[] obstacles) {
        this.participants = participants;
        this.obstacles = obstacles;
    }

    public void compete() {
        for (Participant participant : participants) {
            for (Obstacle obs : obstacles) {
                if (!obs.pass(participant)) {
                    System.out.printf("%s сошел с дистанции. %n", participant.getNAME());
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        Competition competition = new Competition(
                new Participant[] {
                    new Human("Человек1", 2, 2000),
                    new Human("Человек2", 3, 3000),
                    new Cat("Кот1", 8, 50000),
                    new Cat("Кот2", 10, 40000),
                    new Robot("Робот1", 10, 40000),
                    new Robot("Робот2", 10, 40000)},
                new Obstacle[] {
                        new Treadmill("Беговая дорожка ярости",1000),
                        new Wall("Стеночка",1),
                        new Treadmill("Беговая дорожка ярости",2000),
                        new Wall("Стеночка",2),
                        new Treadmill("Беговая дорожка ярости",3000),
                        new Wall("Стеночка",3),
                        new Treadmill("Беговая дорожка ярости",4000),
                        new Wall("Стеночка",4)
                }
        );

        competition.compete();
    }
}
