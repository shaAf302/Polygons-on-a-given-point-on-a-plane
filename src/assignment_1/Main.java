/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author shafa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Shape> shapes = new ArrayList<>();
//        Point p = new Point();
        Scanner sc = new Scanner(System.in);
        FileHandler fh = new FileHandler();
//        fh.ReadFromFile(shapes, p);
fh.ReadFromFile(shapes);
System.out.println("Give the x and y coordinates of the point.");
        System.out.print("x: ");
        Double x = sc.nextDouble();
        System.out.print("y: ");
        Double y = sc.nextDouble();
        Point p = new Point(x,y); 

        int answer = 0;
        for(Shape o : shapes){
            if (o.ContainingAPoint(p))
                    answer++;
        }

        System.out.println( "Number of shapes that contain the given point: " + answer);
    
    }
    
}
