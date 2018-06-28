package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;


public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure() {
//Given
        ShapeCollector sc = new ShapeCollector();
        CircleClass cc = new CircleClass("circle", 22);
        CircleClass cc1 = new CircleClass("circle1", 33);
        CircleClass cc2 = new CircleClass("circle2", 44);
//When
        sc.addFigure(cc);
        sc.addFigure(cc1);
        sc.addFigure(cc2);
//Then
        Assert.assertEquals(sc.getFigure(1), cc1);
    }

    @Test
    public void testAddFigureNotExists() {
//Given
        ShapeCollector sc = new ShapeCollector();
        CircleClass cc = new CircleClass("circle", 22);
        CircleClass cc1 = new CircleClass("circle1", 33);
//When
        sc.addFigure(cc);
        sc.addFigure(cc1);
//Then
        Assert.assertNotEquals(sc.getFigure(0), cc1);
        Assert.assertNotEquals(sc.getFigure(0).getField(), cc1.getField());
    }

    @Test
    public void testRemoveFigure() {
//Given
        ShapeCollector sc = new ShapeCollector();
        TriangleClass tc = new TriangleClass("triangle",77);
        TriangleClass tc1 = new TriangleClass("triangle1",21);
//When
        sc.addFigure(tc);
//Then
        boolean checkRemove = sc.removeFigure(tc);
        Assert.assertTrue(checkRemove);
    }

    @Test
    public void testRemoveFigureNotExists() {
//Given
        ShapeCollector sc = new ShapeCollector();
        TriangleClass tc = new TriangleClass("triangle",77);
        TriangleClass tc1 = new TriangleClass("triangle1",56);
        TriangleClass tc2 = new TriangleClass("triangle2",54);
//When
        sc.addFigure(tc);
//Then
        boolean checkRemove = sc.removeFigure(tc2);
        Assert.assertFalse(checkRemove);
    }

    @Test
    public void testGetFigure() {
//Given
        ShapeCollector sc = new ShapeCollector();
        SquareClass sq = new SquareClass("square1", 31);
        SquareClass sq1 = new SquareClass("square2", 19);
//When
        sc.addFigure(sq);
        sc.addFigure(sq1);
//Then
        Assert.assertEquals(sc.getFigure(1), sq1);
    }

    @Test
    public void testGetFigureNotExists() {
//Given
        ShapeCollector sc = new ShapeCollector();
        SquareClass sq = new SquareClass("square", 46);
        SquareClass sq1 = new SquareClass("square1", 52);
//When
        sc.addFigure(sq);
        sc.addFigure(sq1);
//Then
        Assert.assertNotEquals(sc.getFigure(0), sq1);
    }

}
