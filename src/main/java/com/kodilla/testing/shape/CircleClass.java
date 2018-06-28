package com.kodilla.testing.shape;

public class CircleClass implements Shape {
    private String name;
    private int field;


    public CircleClass(String name, int field) {
        this.name = name;
        this.field = field;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public int getField() {
        return field;
    }
}
