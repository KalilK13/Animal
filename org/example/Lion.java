package org.example;

public class Lion extends Feline{

    private Character gender;
    public Lion(String food, Character gender) {
        super(food);
        this.gender = gender;
    }

    @Override
    public void makeNoise() {
        System.out.println("Lions eat " + getFood());
        System.out.println("Roar Roar");

    }
}