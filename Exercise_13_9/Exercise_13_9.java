package SDEV200.Exercise_13_9;

import SDEV200.ToolKit.GeometricObject;

public class Exercise_13_9 {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(14);

        
        System.out.println("c1 equals c2? " + c1.equals(c2));
    }

    
}

class Circle extends GeometricObject
    implements Comparable <GeometricObject> {
    private double radius;

    public Circle(){
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius; 
        setColor(color);
        setFilled(filled);
    }

    //return Radius
    public double getRadius() {
        return radius;
    }

    //Set new radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Return area
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Circle && radius == ((Circle) obj).radius;
    }

    public void printCircle(){
        System.out.println("The circle is created" + getDateCreated()
            + "and the radius is " + radius);
    }

    }
