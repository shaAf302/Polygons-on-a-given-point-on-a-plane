/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_1;

/**
 
 * @author shafa
 */
public class Point {
   private double x;
   private double y;
   
   public Point(double x, double y){
   this.x=x;
   this.y=y;
   }
   //default point constructor
   public Point(){
   this(0,0);
   }
   public double getX(){
   return x;
   }
   public double getY(){
   return y;
   }
   

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
   
   @Override
   public String toString(){
   return "Point{" + "x=" + x + ", y=" + y + '}';
   }
}
