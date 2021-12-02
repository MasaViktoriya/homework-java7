package com.geekbrains;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness = false;
    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p){
        if (p.getFood() < appetite){
            System.out.println("Кот " + name + " слишком прожорлив. В тарелочке не хватит еды.");
        } else {
            p.decreaseFood(appetite);
            fullness = true;
            System.out.println("Котом "+ name + " сожрано " + appetite + " еды.");
        }
    }
    public void isFull(Cat cat){
        if (cat.getFullness()) {
            System.out.println("Кот " + cat.getName() + " сыт и доволен. Погладь кота.");
        } else {
            System.out.println("Кот " + cat.getName() + " голодный и злой. А ты выглядишь съедобно. БЕГИ!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean getFullness() {
        return fullness;
    }
}
