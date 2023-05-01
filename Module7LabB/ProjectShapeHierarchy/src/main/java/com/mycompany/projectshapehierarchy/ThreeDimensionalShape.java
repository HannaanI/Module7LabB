/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectshapehierarchy;

/**
 *
 * @author hannaan
 */
public abstract class ThreeDimensionalShape extends Shape {
    private int dimensionOne;
    private int dimensionTwo;
    private int dimensionThree;
    
    public ThreeDimensionalShape(int x, int y, int dimension1, int dimension2, int dimension3 ) {
        super(x, y);
        dimensionOne = dimension1;
        dimensionTwo = dimension2;
        dimensionThree = dimension3;

    }

    public int getDimensionOne() {
        return dimensionOne;
    }

    public void setDimensionOne(int dimensionOne) {
        this.dimensionOne = dimensionOne;
    }

    public int getDimensionTwo() {
        return dimensionTwo;
    }

    public void setDimensionTwo(int dimensionTwo) {
        this.dimensionTwo = dimensionTwo;
    }

    public int getDimensionThree() {
        return dimensionThree;
    }

    public void setDimensionThree(int dimensionThree) {
        this.dimensionThree = dimensionThree;
    }
    public abstract int getArea();

    public abstract int getVolume();
}
