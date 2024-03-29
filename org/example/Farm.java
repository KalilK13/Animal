package org.example;

public class Farm {
    public static void main(String[] args) {
        Lion lion = new Lion("People", 'M');
        lion.makeNoise();

        Dog dog = new Dog("Bones");
        dog.makeNoise();

        Animal.printAnimalInfo(dog);
        Animal.printAnimalInfo(lion);

        RoboDog roboDog = new RoboDog();

        Pet[] pets = {dog, roboDog};

        for(Pet p: pets){
            p.greetOwner();
        }




    }
}