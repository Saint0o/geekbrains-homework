package ru.geekbrains.HomeWork4;

public class Wall extends Obstacle {
    private final int HEIGHT;

    public Wall(String name, int HEIGHT) {
        super(name);
        this.HEIGHT = HEIGHT;
    }

    @Override
    public boolean pass(Participant participant) {
        boolean pass = false;
        if (participant instanceof Jumpable) {
            pass = participant.getMaxJump() > HEIGHT;
            System.out.printf("%s %s перепрыгнул стенку длиной %d %n", participant.getNAME(), pass ? "" : "не", HEIGHT);
        } else {
            System.out.printf("%s не умеет прыгать%n", participant.getNAME());
        }
        return pass;
    }
}
