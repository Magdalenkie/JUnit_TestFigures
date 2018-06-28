package com.kodilla.testing.shape;
import java.util.ArrayList;
import java.util.LinkedList;

public class ShapeCollector {

    private ArrayList<Shape> figureList = new ArrayList<Shape>();

    void addFigure(Shape shape){
        figureList.add(shape);
    };

    boolean removeFigure(Shape shape){

        if (figureList.contains(shape)){
            figureList.remove(shape);
            return true;
        }
        return false;
    };

    Shape getFigure(int n) {
        return figureList.get(n);
    }

    void showFigures(){
        for (Shape element : figureList) {
            System.out.println(element.getShapeName());
        }
    }


//    public ShapeCollector(String shapeName, int field){
//        this.shapeName = shapeName;
//        this.field = field;
//    }






}
