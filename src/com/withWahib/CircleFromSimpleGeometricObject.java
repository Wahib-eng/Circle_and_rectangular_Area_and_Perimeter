package com.withWahib;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject{
    private double radius;

    public CircleFromSimpleGeometricObject() {
    }

    public CircleFromSimpleGeometricObject(double radius) {
        this.radius = radius;
    }

    public CircleFromSimpleGeometricObject(double radius,
                                           String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);

    }
    /*أعادة نصف الثطر  */
    public double getRadius() {
        return radius;
    }

    /* وضع نصف قطر جديد  */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /* اعادة المساحة */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /* أعادة القطر  */
    public double getDiameter() {
        return 2 * radius;
    }

    /*أعادة المحيط  */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /* طباعة بيانات الدائرة    */
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
                " and the radius is " + radius);
    }
}
