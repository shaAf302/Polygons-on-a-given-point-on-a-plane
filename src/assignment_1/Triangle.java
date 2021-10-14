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
public class Triangle extends Shape {
private Point a;
private Point b;
private Point c;
private double height;
private double apothem; // the distance from the center of the polygon to the midpoint of a side 

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public double getHeight() {
        return height;
    }

    public double getApothem() {
        return apothem;
    }

    public Triangle(Point center, double Radius) {
        super(center, Radius);
        this.height=Radius/2 * Math.sqrt(3);
        this.apothem=height/3;
        this.a= new Point(center.getX()-Radius/2, center.getY()- apothem );
        this.b=new  Point(center.getX(), center.getY() + apothem*2);
        this.c= new Point(center.getX()+Radius/2, center.getY()- apothem );
    }

    public Triangle(Point a, Point b, Point c) {
        super(null, 0);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    

    private double area(Point x, Point y, Point z){
return Math.abs((x.getX()*(y.getY()-z.getY()) + y.getX()*(z.getY()-x.getY())+ z.getX()*(x.getY()-y.getY()))/2.0);     
    }
    @Override
    public boolean ContainingAPoint(Point x) {
        double TArea=area(a,b,c);
    double PAB = area(x, a, b);
    double PBC = area(x, b, c);
    double PAC = area(x, a, c);
    
    double totalSlicesArea = PAB + PBC + PAC;
        return (double) Math.round(TArea * 1000000) / 1000000 ==  (double) Math.round(totalSlicesArea * 1000000) / 1000000;
    
    }
    
    @Override
    public String toString() {
        return "Triangle{ " + center + ", " + Radius + "}";
    }
    
}
