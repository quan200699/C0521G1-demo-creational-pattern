package com.company.factory;

public class AnimalFactory {
    public static Animal getAnimal(String type) {
        Animal animal = null;
        switch (type) {
            case "Lion": {
                animal = new Lion();
                break;
            }
            case "Tiger": {
                animal = new Tiger();
                break;
            }
            case "Dog": {
                animal = new Dog();
                break;
            }
            case "Cat": {
                animal = new Cat();
                break;
            }
        }
        return animal;
    }
}
