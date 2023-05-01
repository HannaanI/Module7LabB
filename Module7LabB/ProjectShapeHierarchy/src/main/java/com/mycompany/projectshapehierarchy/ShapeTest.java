/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectshapehierarchy;

/**
 *
 * @author hannaan
 */
public class ShapeTest {
    public static void main( String args[] ) {
        Shape shape[] = new Shape[ 1 ];
        shape[0] = new Circle( 12, 24, 14 ) {};
        shape[1] = new Square( 66, 12, 70 ) {};

        for (int i = 0; i < shape.length; i++) {
    Shape currentShape = shape[i];
    System.out.printf("%s: %s", currentShape.getName(), currentShape);
    if (currentShape instanceof TwoDimensionalShape) {
        TwoDimensionalShape twoDimensionalShape = (TwoDimensionalShape) currentShape;
        System.out.printf("%s's area is %s\n", currentShape.getName(), twoDimensionalShape.getArea());
    }
}
    }
}
