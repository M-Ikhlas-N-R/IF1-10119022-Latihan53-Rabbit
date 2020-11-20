package com.minr;

public class Rabbit extends Animal{
    private String color, name;

    public Rabbit(String name, boolean veg, String food, int legs, String color){
        super(veg, food, legs);
        this.name = name;
        this.color = color;


    }

    public String getColor(){
        return this.color;
    }

    public String getName(){
       return this.name;
    }
}
