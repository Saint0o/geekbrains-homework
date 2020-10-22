package ru.geekbrains.HomeWork4;

public class Fish extends Participant implements Swimmable{
    protected Fish(String name, int maxSwim) {
        super(name);
        setMaxSwim(maxSwim);
    }

    @Override
    public void setMaxSwim(int maxSwim) {
        super.maxSwim = maxSwim;
    }


}
