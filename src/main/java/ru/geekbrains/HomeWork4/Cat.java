package ru.geekbrains.HomeWork4;

public class Cat extends Participant implements Runnable, Jumpable {

    protected Cat(String name, int maxJump, int maxRun) {
        super(name);
        setMaxJump(maxJump);
        setMaxRun(maxRun);
    }

    @Override
    public void setMaxJump(int maxJump) {
        super.maxJump = maxJump;
    }

    @Override
    public void setMaxRun(int maxRun) {
        super.maxRun = maxRun;
    }
}
