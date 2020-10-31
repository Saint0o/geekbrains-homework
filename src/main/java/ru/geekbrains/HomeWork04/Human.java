package ru.geekbrains.HomeWork04;

public class Human extends Participant implements Runnable, Jumpable, Swimmable {

    public Human(String name, int maxJump, int maxRun, int maxSwim) {
        super(name);
        setMaxJump(maxJump);
        setMaxRun(maxRun);
        setMaxSwim(maxSwim);
    }

    @Override
    public void setMaxJump(int maxJump) {
        super.maxJump = maxJump;
    }

    @Override
    public void setMaxRun(int maxRun) {
        super.maxRun = maxRun;
    }

    @Override
    public void setMaxSwim(int maxSwim) {
        super.maxSwim = maxSwim;
    }
}
