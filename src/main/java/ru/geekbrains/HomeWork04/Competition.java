package ru.geekbrains.HomeWork04;

public class Competition {
    private final Participant[] participants;

    private final Obstacle[] obstacles;

    public Competition(Participant[] participants, Obstacle[] obstacles) {
        this.participants = participants;
        this.obstacles = obstacles;
    }

    public void compete() {
        for (Participant participant : participants) {
            boolean finished = true;
            for (Obstacle obs : obstacles) {
                if (!obs.pass(participant)) {
                    System.out.printf("%s сошел с дистанции. %n", participant.getName());
                    finished = false;
                    break;
                }
            }
            if (finished) System.out.println(participant.getName() + " прошел все испытания");
        }

    }

    public static void main(String[] args) {

        Competition competition = new Competition(
                new Participant[]{
                        new Bird("птичка", 12, 100000),
                        new Human("Человек1", 5, 5000, 100),
                        new Human("Человек2", 1, 2, 100),
                        new Cat("Кот1", 1, 2),
                        new Cat("Кот2", 3, 4),
                        new Robot("Робот1", 1),
                        new Robot("Робот2", 1),
                        new Fish("Рыбка1", 22)
                },
                new Obstacle[]{
                        new Pool("Бассейн", 10),
                        new Abyss("Бездна", 10),
                        new Treadmill("Беговая дорожка ярости", 1000),
                        new Wall("Стеночка", 1),
                        new Treadmill("Беговая дорожка ярости", 2000),
                        new Wall("Стеночка", 2),
                        new Treadmill("Беговая дорожка ярости", 3000),
                        new Wall("Стеночка", 3),
                        new Treadmill("Беговая дорожка ярости", 4000),
                        new Wall("Стеночка", 4),
                        new Abyss("Бездна", 0)
                }
        );

        competition.compete();
    }
}
