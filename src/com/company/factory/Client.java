package com.company.factory;

public class Client {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal("Dog");
        System.out.println(animal.getAnimalType());
        animal = AnimalFactory.getAnimal("Lion");
        ((Lion) animal).setName("Mèo");
        System.out.println(((Lion) animal).getName());

        String x = new String("abc");
        String y = "abc";
        System.out.println(x == "abc");
    }
}
