package org.example;

public class Dog extends Canine implements Pet {
    @Override
    public void greetOwner() {
        System.out.println("Lick your face");
    }

    public Dog(String food) {
        super(food);
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof woof");
    }
}
