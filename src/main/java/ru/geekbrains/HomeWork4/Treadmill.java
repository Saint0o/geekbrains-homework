package ru.geekbrains.HomeWork4;

public class Treadmill extends Obstacle {
    private final int LENGTH;

    public Treadmill(String name, int LENGTH) {
        super(name);
        this.LENGTH = LENGTH;
    }

    @Override
    public boolean pass(Participant participant) {
        boolean pass = false;
        if (participant instanceof Runnable) {
            pass = participant.getMaxRun() > LENGTH;
            System.out.printf("%s %s пробежал беговую дорожку длиной %d %n", participant.getNAME(), pass ? "" : "не", LENGTH);
        } else {
            System.out.printf("%s не умеет бегать%n", participant.getNAME());
        }
        return pass;
    }
}
