package com.withWahib;

public class RectangleFromSimpleGeometricObject extends SimpleGeometricObject{
    private double width;
    private double height;
    public RectangleFromSimpleGeometricObject () {
    }
    public RectangleFromSimpleGeometricObject(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public RectangleFromSimpleGeometricObject(
            double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }
    /*  أعادة العرض */
    public double getWidth() {
        return width;
    }

    /* وضع العرض */
    public void setWidth(double width) {
        this.width = width;
    }

    /* اعادة الارتفاع */
    public double getHeight() {
        return height;
    }

    /* وضع الارتفاع  */
    public void setHeight(double height) {
        this.height = height;
    }
    /* اعادة المساحة  */
    public double getArea() {
        return width * height;
    }

    /* اعادة المحيط*/
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
