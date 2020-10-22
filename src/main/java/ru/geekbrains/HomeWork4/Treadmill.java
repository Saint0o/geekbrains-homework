package ru.geekbrains.HomeWork4;

public class Treadmill extends Obstacle {
    private final int LENGTH;

    public Treadmill(String name, int LENGTH) {
        super(name);
        this.LENGTH = LENGTH;
    }

    public int getLENGTH() {
        return LENGTH;
    }

    @Override
    public boolean pass(Participant participant) {
        boolean pass = participant.getMAX_RUN() > LENGTH;
        System.out.printf("%s %s пробежал беговую дорожку длиной %d %n", participant.getNAME(), pass ? "" : "не", LENGTH);
        return pass;
    }
}
