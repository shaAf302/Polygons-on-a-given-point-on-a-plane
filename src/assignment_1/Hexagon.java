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
public class Hexagon extends Shape {

    private Point[] points = new Point[6];
    private Triangle[] triangles=new Triangle[6];
    private double height;

    public Hexagon( Point center, double Radius) {
        super(center, Radius);
        this.height = Radius*Math.sqrt(3);
        
        points[0] = new Point(center.getX() - Radius/2, center.getY() - height/2);
        points[1] = new Point(center.getX() - Radius, center.getY());
        points[2] = new Point(center.getX() - Radius/2, center.getY() + height/2);
        points[3] = new Point(center.getX() + Radius/2, center.getY() + height/2);
        points[4] = new Point(center.getX() + Radius, center.getY());
        points[5] = new Point(center.getX() - Radius/2, center.getY() - height/2);
        
        
        triangles[0] = new Triangle(points[0], center, points[5]);
        triangles[1] = new Triangle(points[1], center, points[0]);
        triangles[2] = new Triangle(points[1], points[2], center);
        triangles[3] = new Triangle(points[2], points[3], center);
        triangles[4] = new Triangle(center, points[3], points[4]);
        triangles[5] = new Triangle(center, points[4], points[5]);
    }

    public double getHeight() {
        return height;
    }
    
    
        
    @Override
    public boolean ContainingAPoint(Point x) {

    boolean b = false;
        for (Triangle t: triangles){
            if (t.ContainingAPoint(x))
                    b=true;
        }
        return b;
    }
    
    @Override
    public String toString() {
        return "Hexagon{ " + center + ", " + Radius + "}";
    }
}
