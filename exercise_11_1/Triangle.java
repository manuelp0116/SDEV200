package SDEV200.exercise_11_1;

import SDEV200.ToolKit.GeometricObject;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    // no arg constructor for default triangle
    Triangle(){
        side1 = side2 = side3 = 1.0;
    }

    // constructor for triangle with specified sides
    Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //Accessors
    public double getSide1(){
        return side1;
    }
    public double getSide2(){
        return side2;
    }

    public double getSide3(){
        return side3;
    }

    //area
    public double getArea() {
        double s = (side1 + side2 +side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter(){
        return side1 + side2 +side3;
    }

    //String with description of triangle

    public String toString(){
        return "Triangle: side1 = " + side1 + " " + "side2 = " + side2
         + " " + "side3 = " + side3;
    }
}
