package ru.geekbrains.HomeWork4;

public class Wall extends Obstacle {
    private final int height ;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    @Override
    public boolean pass(Participant participant) {
        boolean pass = false;
        if (participant instanceof Jumpable) {
            pass = participant.getMaxJump() > height;
            System.out.printf("%s %s перепрыгнул стенку длиной %d %n", participant.getName(), pass ? "" : "не", height);
        } else {
            System.out.printf("%s не умеет прыгать%n", participant.getName());
        }
        return pass;
    }
}
