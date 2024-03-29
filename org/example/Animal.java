package org.example;

public abstract class Animal {
    private String food;
    public Animal(String food){
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public abstract void makeNoise();
    public static void printAnimalInfo(Animal animal){
        System.out.println(animal);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                '}';
    }
}
