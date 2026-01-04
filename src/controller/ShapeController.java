package controller;

import model.Shape;

public class ShapeController {

    public double calcTotalArea(Shape[] shapes) {
        double sum = 0;
        for (Shape s : shapes) {
            sum += s.calcArea();
        }
        return sum;
    }

    public double calcAreaByType(Shape[] shapes, Class<?> type) {
        double sum = 0;
        for (Shape s : shapes) {
            if (s.getClass() == type) {
                sum += s.calcArea();
            }
        }
        return sum;
    }
}
