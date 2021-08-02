package com.company.factory;

public class Lion extends Animal {
    private String name;

    @Override
    public String getAnimalType() {
        return "Lion";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
