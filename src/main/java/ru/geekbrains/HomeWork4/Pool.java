package ru.geekbrains.HomeWork4;

public class Pool extends Obstacle {
    private final int LENGTH;

    protected Pool(String name, int length) {
        super(name);
        LENGTH = length;
    }

    @Override
    public boolean pass(Participant participant) {
        boolean pass = false;
        if (participant instanceof Swimmable) {
            pass = participant.getMaxSwim() > LENGTH;
            System.out.printf("%s %s переплыл бассейн длиной %d %n", participant.getNAME(), pass ? "" : "не", LENGTH);
        } else {
            System.out.printf("%s не умеет плавать%n", participant.getNAME());
        }
        return pass;
    }
}
