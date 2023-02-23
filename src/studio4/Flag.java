package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		   StdDraw.setXscale(0, 24);
		   StdDraw.setYscale(0, 18);
		   StdDraw.clear();
		   
		   
		   StdDraw.setPenColor(214, 39, 24);
		   StdDraw.filledRectangle(5, 3.5, 5, 3.5);
		   StdDraw.filledRectangle(5, 14.5, 5, 3.5);
		   StdDraw.filledRectangle(19, 3.5, 5, 3.5);
		   StdDraw.filledRectangle(19, 14.5, 5, 3.5);
		   
		   
		   StdDraw.setPenColor(5, 1, 0);
		   StdDraw.filledRectangle(12, 9, 12, 2);
		   StdDraw.filledRectangle(12, 9, 2, 9);
		   
		   StdDraw.setPenColor(255, 255, 255);
		   StdDraw.filledRectangle(12, 9, 2, 2);
		   
//		   

		
	}
}