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

public class TestPoint {

	public static void main(String[] args) {
		Point2D point1=new Point2D(5,6);//user
		System.out.println(point1);
		Point2D point2=new Point2D(8,6);//user
		// TODO Auto-generated method stub
		System.out.println(point2);
		if(point1.isequals(point2)){
			System.out.println("same");
		}
		else {
			System.out.println("DIFFERENT");
		}
	}

}
