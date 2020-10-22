package ru.geekbrains.HomeWork4;

public class Robot extends Participant implements Runnable{

    protected Robot(String name, int length) {
        super(name);
        setMaxRun(length);
    }

    @Override
    public void setMaxRun(int maxRun) {
        super.maxRun = maxRun;
    }
}
