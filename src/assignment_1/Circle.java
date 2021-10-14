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
public class Circle extends Shape {
public Circle (Point center, double radius){
super(center,radius);
}
    @Override
    public boolean ContainingAPoint(Point x) {
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    double a = center.getX()-x.getX();
    double b = center.getY()-x.getY();
    double c = Radius;
    return a*a+b*b <= c*c;
    }
    
    @Override
    public String toString(){
    return "Circle{ " + center + " , " + Radius + "}";
    }
    
}
