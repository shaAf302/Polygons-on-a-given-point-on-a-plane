/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author shafa
 */
class FileHandler {
    public void ReadFromFile(ArrayList<Shape> shapes){
        Scanner sc = new Scanner(System.in);
        String fname;
        File file;
        System.out.print("Filename or path: ");
        while(true){
            try {
                fname = sc.nextLine();
                file = new File(fname);
                if(!file.exists()) throw new FileNotFoundException();
                break;
            }
            catch(FileNotFoundException e){
                System.err.println("File not found, try again.");
            }
            catch(Exception e){
                System.err.println("An unknown error occurred, please try again.");
            }
        }
        int currentLine = 0;
        try(BufferedReader bf = new BufferedReader(new FileReader(fname))){
//            String fLine = bf.readLine();
//            String[] arr = fLine.split(" ");
//            double px  = Double.parseDouble(arr[0]);
//            double py  = Double.parseDouble(arr[1]);
            
//            p.setX(px);
//            p.setY(py);
                    
            String line;
            int length = Integer.parseInt(bf.readLine());
            //System.out.println("first");
            for(int i=0; i<length; i++){
                if( (line = bf.readLine()) == null){
                    throw new NullPointerException();
                }
              //  System.out.println(line + "s");
                String[] info = line.split(" ");
               // System.out.println(line + "sss");
                if(info.length != 4){
                    currentLine = i+2;
                    throw new IndexOutOfBoundsException();
                }
                String sh = info[0].toLowerCase();
                double x = Double.parseDouble(info[1]);
                double y = Double.parseDouble(info[2]);
                double sideLength = Double.parseDouble(info[3]);
                switch (sh){
                        case "c":
                            shapes.add(new Circle(new Point(x,y), sideLength));
                            break;           
                        case "t":
                            shapes.add(new Triangle(new Point(x,y), sideLength));
                            break;
                        case "s":
                            shapes.add(new Square(new Point(x,y), sideLength));
                            break;
                        case "h":
                            shapes.add(new Hexagon(new Point(x,y), sideLength));
                            break;
                        default:
                            currentLine = i+2;
                            throw new IllegalArgumentException();
                }               
            }
        }
        catch(NullPointerException e){
            System.err.println("The number of objects do not match the first number.");
                    
        }
        catch(IllegalArgumentException e){
            System.err.println("Line " + currentLine + " in the file starts with an illegal character."
                    + " It should start with c, t, s or h.");
        }
        catch(IndexOutOfBoundsException e){
            System.err.println("There is something wrong with line " + currentLine + " in the file.");
        }
catch(IOException e){
            System.err.println("An IO exception occurred.");
        }    }
}
    
    