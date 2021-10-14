# Polygons-on-a-given-point-on-a-plane
Choose a point on the plane and fill a collection with several regular shapes (circle, regular triangle, square, regular hexagon). How many shapes contain the given point? 
Each shape can be represented by its center and side length (or radius), if we assume that one side of the polygons are parallel with x axis, and its nodes lies on or above this side. Load and create the shapes from a text file. The first line of the file contains the number of the shapes, and each following line contain a shape. The first character will identify the type of the shape, which is followed by the center coordinate and the side length or radius. Manage the shapes uniformly, so derive them from the same super class.

# Classes and Methods.

Description of Methods: 
Point Class:
This class has attributes of coordinates and constructor along with getters of those coordinates.
Shape Class:

This class contains a center and side Length along with the constructor of shape, and an abstract method for checking the point within the shape. ContainingAPoint();
Triangle Class:

This class is extended from shape class, it has 3 vertices, height, and an apothem for a triangle.
With some methods of calculating the total area, then checking the point
Hexagon:
This class in extended from shape class and has methods of getting a height as it is also composed of 6 triangles, then checking whether it contains point in it or not.
Square:  
This class is extended by shape class, and it has a constructor and method for checking the point in it.
Circle:
This class is extended by shape class, and it has a constructor and method for checking the point in it.  
