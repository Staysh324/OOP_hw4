package works;

import java.util.ArrayList;
import java.util.List;

class Box<T> {
    private List<T> fruits;

public Box() {
        fruits = new ArrayList<>();
        }

public void add(T fruit) {
        fruits.add(fruit);
        }

public int getWeight() {
        int totalWeight = 0;
        for (T fruit : fruits) {
        if (fruit instanceof Fruit) {
        totalWeight += ((Fruit) fruit).getWeight();
        }
        }
        return totalWeight;
        }

public void moveTo(Box<T> otherBox) {
        otherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
        }
        }