/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectshapehierarchy;

/**
 *
 * @author hannaan
 */
public abstract class Circle extends TwoDimensionalShape{
    public Circle( int x, int y, int radius ) {
        super( x, y, radius, radius );
    }
    public String getName() {
        return "Circle";
    }
    
   public int getArea() {
    int area = (int) (Math.PI * getDimensionOne() * getDimensionOne());
    return area;
   }
   
}

