package SDEV200.exercise_11_1;

import java.util.Scanner;

public class exercise_11_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //User input for trinagle sides
        System.out.print("Enter three sides of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        //User input for color
        System.out.print("Enter a color: ");
        String color = input.next();

        //User input for fill boolean
        System.out.print("Is the triangle filled (true / false): ");
        boolean filled = input.nextBoolean();

        //Create object with user input
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println(triangle.toString());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Triangle is " + (triangle.isFilled() ? "" : " not ") 
            + "filled.");
        
    }
}
