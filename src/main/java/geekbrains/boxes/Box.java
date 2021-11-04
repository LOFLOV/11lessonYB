package geekbrains.boxes;

import geekbrains.friuts.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Box {

    private List<Fruit> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void insertFruit(Fruit fruit) {
        if (fruits.size() == 0) {
            fruits.add(fruit);
        } else {
            boolean isSame = isBoxSameFruit(fruit);
            if(isSame) {
                fruits.add(fruit);
            } else {
                System.out.println("Разные фрукты: " + fruit.getClass().getSimpleName() + " и " + fruits.get(0).getClass().getSimpleName());
            }
        }
    }

    public float getWeight() {                              // получить вес коробки
        if (fruits.size() == 0) return 0;
        return fruits.get(0).weight * fruits.size();
    }

    public boolean compare(Box box) {                       //сравнить вес коробок
        return this.getWeight() == box.getWeight();
    }

    public void putToBox(Box box) {                         //в текущую коробку добавть фрукты из входящей коробки
        if (box.fruits.size() == 0) {                               //если входящая коробка не пустая
            System.out.println("Взята пустая коробка");
        } else {
            if(isBoxSameFruit(box.fruits.get(0))) {
                System.out.println("Разные фрукты в коробках");
            } else {
                this.fruits.addAll(box.fruits);
                box.fruits.clear();
            }
        }
    }
    private boolean isBoxSameFruit(Fruit fruit) {
        if (fruits.size() == 0) {
            return false;
        } else {
            if (!fruit.getClass().equals(fruits.get(0).getClass())) {
                System.out.println("Разные фрукты: " + fruit.getClass().getSimpleName() + " и " + fruits.get(0).getClass().getSimpleName());
                return false;
            } else {
                return true;
            }

        }
    }

}
