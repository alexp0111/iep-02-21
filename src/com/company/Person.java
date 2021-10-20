package com.company;

public class Person {

    private static int lastID;
    private static double shortnessPeoplePoint1 = 1.2;
    private static double shortnessPeoplePoint2 = 1.5;

    private String name;
    private double height;
    private final int id;

    public Person(String name, double heightMeter) {
        id = lastID++;
        if (name != null && name.length() != 0) {
            this.name = name;
        } else {
            this.name = "Default name: " + id;
        }
        this.height = heightMeter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() == 0) return;
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getPrettyHeigh(){
        if (height < shortnessPeoplePoint1){
            return "Nizkiy";
        }
        if (height < shortnessPeoplePoint2){
            return "HalfMen";
        }
        return "Normal";
    }

    public static void setHeightPoint(double p1, double p2){
        Person.shortnessPeoplePoint1 = p1;
        Person.shortnessPeoplePoint2 = p2;
    }
}
