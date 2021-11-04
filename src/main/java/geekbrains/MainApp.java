package geekbrains;

import geekbrains.boxes.Box;
import geekbrains.friuts.Apple;
import geekbrains.friuts.Fruit;
import geekbrains.friuts.Orange;

public class MainApp {

    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();
        Fruit apple1 = new Apple();
        Fruit apple2 = new Apple();
        Fruit orange1 = new Orange();
        Fruit orange2 = new Orange();

        box1.insertFruit(apple1);
        box1.insertFruit(apple2);
        System.out.println(box1.getWeight());
        box2.insertFruit(orange1);
        box2.insertFruit(orange2);
        System.out.println(box2.getWeight());


//        box2.putToBox(box1); //в текущую коробку добавть фрукты из входящей коробки
        box3.putToBox(box1);
        System.out.println(box3.getWeight());
        box3.putToBox(box1);








    }

}
