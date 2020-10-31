package ru.geekbrains.HomeWork04;

public class Pool extends Obstacle {
    private final int length;

    protected Pool(String name, int length) {
        super(name);
        this.length = length;
    }

    @Override
    public boolean pass(Participant participant) {
        boolean pass = false;
        if (participant instanceof Swimmable) {
            pass = participant.getMaxSwim() > length;
            System.out.printf("%s %s переплыл бассейн длиной %d %n", participant.getName(), pass ? "" : "не", length);
        } else {
            System.out.printf("%s не умеет плавать%n", participant.getName());
        }
        return pass;
    }
}
