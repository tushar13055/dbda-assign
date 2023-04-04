//Create a Point class Point2D  , under package "com.acts.geometry" for representing a point in x-y co-ordinate system.
//
//2.1 Create a parameterized constructor to accept x & y co-ords.
//
//2.2 Add public String show()) --to return point's x & y co-ords
//
//2.3 Add equals method to Point2D class : boolean returning method : must return true if both points are having same x,y co-ords or false otherwise. : 
//
//2.4 Write a Tester class to test your functionality , TestPoint.java , under the package "tester"
//Create 2 points , using user supplied inputs
//Display x , y co ordinates .
//Display message "SAME" if 2 points are same , otherwise display "DIFFERENT"
package com.acts.geometry;

public class Point2D {
 private int x;
 private int y;
public Point2D(int x, int y) {
	super();
	this.x = x;
	this.y = y;
}
public String show() {
	return x+" "+y;
}
@Override
public String toString() {
	return "Point2D [x=" + x + ", y=" + y + "]";
}

public boolean isequals(Point2D anotherPoint) {
	if(this.x == anotherPoint.x && this.y == anotherPoint.y) {
		return true;
	}
	return false;
}
 
}
