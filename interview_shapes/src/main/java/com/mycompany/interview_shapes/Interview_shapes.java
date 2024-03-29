/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.interview_shapes;

/**
 *
 * @author SR IT
 */
/*public class Interview_shapes {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}*/

class GeometricShape {

    public double calculateArea() {
        return 0.0;
    }
}

class Circle extends GeometricShape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends GeometricShape {

    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class Interview_shapes {

    public static void main(String[] args) {
        
        Circle circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.calculateArea());
        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
