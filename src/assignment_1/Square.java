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
public  class Square extends Shape{
public Square(Point  center, double Radius){
super(center,Radius);
}
    @Override
    public boolean ContainingAPoint(Point x) {
       return x.getX() >= center.getX() - Radius/2 && x.getX() <= center.getX()+ Radius/2 
                && x.getY() >= center.getY() -Radius/2 && x.getY() <= center.getX()+ Radius/2;
        
        
                
               
    }
    @Override
    public String toString(){
    
    return "Square {" + center + " , " + Radius + "}"; 
            }
    
    
}
