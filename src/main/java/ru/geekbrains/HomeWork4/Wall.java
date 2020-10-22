package ru.geekbrains.HomeWork4;

public class Wall extends Obstacle {
    private final int HEIGHT;

    public Wall(String name, int HEIGHT) {
        super(name);
        this.HEIGHT = HEIGHT;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    @Override
    public boolean pass(Participant participant) {
        boolean pass = participant.getMAX_JUMP() > HEIGHT;
        System.out.printf("%s %s перепрыгнул стенку длиной %d %n", participant.getNAME(), pass ? "" : "не", HEIGHT);
        return pass;
    }
}
