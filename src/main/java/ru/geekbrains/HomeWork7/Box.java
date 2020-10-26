package ru.geekbrains.HomeWork7;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private final ArrayList<T> fruits = new ArrayList<>();

    public void putFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        if (fruits.size() < 1) {
            return 0;
        } else {
            return fruits.size() * fruits.get(0).weight;
        }
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void putAllFruitsFromThisBoxToAnother(Box<T> box) {
        box.fruits.addAll(fruits);
//        for (T fruit : fruits) {
//            box.putFruit(fruit);
//        }
        fruits.clear();
    }

}
