package ru.geekbrains.HomeWork4;

public class Abyss extends Obstacle {
    private final int LENGTH;

    public Abyss(String name, int length) {
        super(name);
        LENGTH = length;
    }

    @Override
    public boolean pass(Participant participant) {
        boolean pass = false;
        if (participant instanceof Flyable) {
            pass = participant.getMaxFly() > LENGTH;
            System.out.printf("%s %s перелетел пропасть длиной %d %n", participant.getNAME(), pass ? "" : "не", LENGTH);
        } else {
            System.out.printf("%s не умеет летать%n", participant.getNAME());
        }
        return pass;
    }
}
