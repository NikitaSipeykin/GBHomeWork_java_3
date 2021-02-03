package ru.geekbrains.NSipeykin.lesson1.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitBox <T extends Fruit> {
    private List<T> box;

    public FruitBox() {
        this.box = new ArrayList<>();
    }

    public FruitBox(T... fruits) {
        this.box = new ArrayList<>(Arrays.asList(fruits));
    }

    public float getWeight(){ 
        float w = 0.0f;
        for(T fruit : box){
            w += fruit.getWeight();
        }
        return w;
    }

    public boolean compare (FruitBox<?> someBox){
        return Math.abs(this.getWeight() - someBox.getWeight()) < 0.001;
    }

    public void mover (FruitBox<? super T> someBox){
        if(someBox == this){
            return;
        }
        someBox.box.addAll(this.box);
        this.box.clear();
    }

    public void add(T fruit){
        box.add(fruit);
    }
}
