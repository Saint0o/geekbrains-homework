package ru.geekbrains.HomeWork4;

public class Abyss extends Obstacle {
    private final int length;

    public Abyss(String name, int length) {
        super(name);
        this.length = length;
    }

    @Override
    public boolean pass(Participant participant) {
        boolean pass = false;
        if (participant instanceof Flyable) {
            pass = participant.getMaxFly() > length;
            System.out.printf("%s %s перелетел пропасть длиной %d %n", participant.getName(), pass ? "" : "не", length);
        } else {
            System.out.printf("%s не умеет летать%n", participant.getName());
        }
        return pass;
    }
}
