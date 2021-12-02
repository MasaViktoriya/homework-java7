package com.geekbrains;

public class Plate {
    private int food;
    public Plate(int food){
        this.food = food;
    }
    public void info(){
        System.out.println("\nВ тарелочке " + food + " еды.\n");
    }
    public void decreaseFood(int n){
        food -=n;
    }
    public void addFood(int moreFood){
        food += moreFood;
        System.out.println("\nВ тарелочку насыпали " + moreFood + " еды.");
        info();
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
