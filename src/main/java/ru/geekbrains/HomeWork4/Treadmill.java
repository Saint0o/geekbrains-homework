package ru.geekbrains.HomeWork4;

public class Treadmill extends Obstacle {
    private final int length;

    public Treadmill(String name, int length) {
        super(name);
        this.length = length;
    }

    @Override
    public boolean pass(Participant participant) {
        boolean pass = false;
        if (participant instanceof Runnable) {
            pass = participant.getMaxRun() > length;
            System.out.printf("%s %s пробежал беговую дорожку длиной %d %n", participant.getName(), pass ? "" : "не", length);
        } else {
            System.out.printf("%s не умеет бегать%n", participant.getName());
        }
        return pass;
    }
}
