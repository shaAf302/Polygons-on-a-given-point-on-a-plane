/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_1;

/**
 *
 * @author shafa
 */
public abstract class Shape {
    protected Point center;
    protected double Radius;
    /*
    contructor for a shape using center and 
    radius*/
public Shape (Point center, double Radius){
this.center=center;
this.Radius=Radius;
}
public abstract boolean ContainingAPoint(Point x);
}
