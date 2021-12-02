package lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box <N extends Fruit> {
    private List<N> fruits;

    public Box(N... fruits) {
        this.fruits = new ArrayList<>(Arrays.asList(fruits));
    }

    public void add(N fruit) {
        this.fruits.add(fruit);
    }

    public double getWeight() {
        if (this.fruits.size() == 0) return 0.0;
        return this.fruits.size() * this.fruits.get(0).getWeight();

    }

    public boolean compare(Box<?> another) {
        return Math.abs(getWeight() - another.getWeight()) < 0.0001;
    }

    public void movingFruit(Box<N> another) {
        if (this == another) return;
        another.fruits.addAll(fruits);
        fruits.clear();

    }

    public List<N> getFruits() {
        return fruits;
    }
}
