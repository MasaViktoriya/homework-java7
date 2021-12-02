package com.geekbrains;

public class Main {
    public static void main(String[] args){
        Cat vishenka = new Cat("Вишенка", 4);
        Cat shusha = new Cat("Шуша", 5);
        Cat venik = new Cat("Веник", 7);
        Cat shani = new Cat("Шани", 2);
        Cat viktor = new Cat("Виктор", 9);
        Cat shishka = new Cat("Шишка", 6);
        Cat vasya = new Cat("Вася", 8);
        Cat shkoda = new Cat("Шкода", 3);
        Cat[] allCats = {vishenka, shusha, venik, shani, viktor, shishka, vasya, shkoda};
        Plate plate = new Plate(32);
        plate.info();
        for (Cat cat : allCats){
            cat.eat(plate);
        }
        plate.info();
        System.out.println("\nПроверим сытость котов.");
        for (Cat cat : allCats){
            cat.isFull(cat);
        }
        plate.addFood(20);
    }
}
