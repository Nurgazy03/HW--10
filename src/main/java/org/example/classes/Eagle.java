package org.example.classes;

import org.example.interfaces.Animal;

public class Eagle implements Animal {

    private String name;
    private int age;
    private String colour;


    @Override
    public void animalPlus() {
        System.out.println("Eagles are love freedom and fly at a height and land only on a clean glacier ");
    }

    @Override
    public void animalMinus() {
        System.out.println("Eagles are best hunters");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Eagle - " +
                "name: " + name +
                ", age: " + age +
                ", colour: " + colour;

    }
}
