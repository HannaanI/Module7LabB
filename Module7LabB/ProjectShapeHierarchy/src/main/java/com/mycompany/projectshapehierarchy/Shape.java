/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectshapehierarchy;

/**
 *
 * @author hannaan
 */
public abstract class Shape

{

    private int x; 

    private int y; 

    public Shape( int x, int y ){
        this.x = x;
        this.y = y;
     }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
//used Netbeans insert code for this toString
    @Override
    public String toString() {
        return "Shape{" + "x=" + x + ", y=" + y + '}';
    } 
    
     public abstract String getName();
     
}


