/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectshapehierarchy;

/**
 *
 * @author hannaan
 */
public abstract class Square extends TwoDimensionalShape {
    public Square( int x, int y, int side ) {
        super( x, y, side, side );
    }
    public int getArea()    {
    int area = getDimensionOne() * getDimensionOne();
    return area;
}
    
    public String getName(){
        return "Square";
    }

}
    

        
