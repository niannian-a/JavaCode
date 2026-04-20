package com.xzy.www.OOPCircle;

public class Circle {
    private double radii;
    private final double PI=3.14;

    public Circle(double radii) {
        this.radii = radii;
    }

    public Circle() {
    }

    public double getRadii() {
        return radii;
    }

    public void setRadii(double radii) {
        this.radii = radii;
    }

    public double getPI() {
        return PI;
    }
    public double getArea(){
        return PI*radii*radii;
    }
    public double getCircumference(){
        return 2*PI*radii;
    }
}
