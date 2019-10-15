package com.company;

public class House {

    String color;
    int height;


    public String getColor() {
        return this.color;
    }

    public int getHeight() {
        return this.height;
    }

    public void setColor(String color) {
        this.color = "light" + color;
    }

    public void setHeight(int height) {
        this.height = height * 1000;
    }

    public static void main(String[] args) {
        House house1 = new House();
        House house2 = new House();
        house1.setColor("red");
        house1.setHeight(7);
        house2.setColor("green");
        house2.setHeight(5);
        System.out.println("House 1: color: " + house1.getColor() + " height: " + house1.getHeight());
        System.out.println("House 2: color: " + house2.getColor() + " height " + house2.getHeight());

    }
}