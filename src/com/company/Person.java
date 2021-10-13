package com.company;

public class Person {
    private String name;
    private double height;


    public Person(String name, double height) {
        if (name != null) {
            this.name = name;
            this.height = height;
        } else {
            this.name = "Default name";
            this.height = 0;
        }
    }

    public Person() {
        this.name = "Default name";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) return;
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
