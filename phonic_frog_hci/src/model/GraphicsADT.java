/**
 * Graphics Class for HCI / UI Prep Assignment 1 (Phonics Frog Application) 
 * TO DO: Nothing, do not modify this file. You will definitely be only using the most primitive of the 
 * functions, not 3D or anything advanced. 
 * 
 * This is an example of HCI / GUI advanced ADT (Abstract Data Type) coding, which would be 
 * very useful for compartamentalizing your design with more advanced GUI codes. You can use the same 
 * design approach in C, Python, and even HTML / Swift, whatever your language requires. 
 * 
 * Be sure, to ensure, however, that the coding does compile. 
 * Author: Jason Lu (jasonlu968@gmail.com) 
 * Date: 8.02.2019 - 8.16.2019  
 * 
 * Source: https://examples.javacodegeeks.com/desktop-java/swing/java-awt-graphics-example/
 * 
 */

package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import javax.swing.JFrame;

public class GraphicsADT {
	
	// Constructor 
	public GraphicsADT(Graphics g) {
		g.create();
	}
	
	// Drawing (or printing) texts on the graphics screen:
	public void drawString(String str, int xBaselineLeft, int yBaselineLeft, Graphics g) {
		g.drawString("This is a string", 10, 10);
	}
	  
	// Drawing lines:
	public void drawLine(int x1, int y1, int x2, int y2, Graphics g) {
		g.drawLine(10, 20, 10, 20);
		
	}
	public void drawPolyline(int[] xPoints, int[] yPoints, int numPoint, Graphics g) {
		int[] x = {10,20};
		int[] y = {10,20};
		g.drawPolyline(x,y, 5);
	}
	  
	// Drawing primitive shapes:
	public void drawRect(int xTopLeft, int yTopLeft, int width, int height, Graphics g) {
		g.drawRect(10, 20, 30, 40);
		g.setColor(Color.BLUE);
	}

	public void drawOval(int xTopLeft, int yTopLeft, int width, int height, Graphics g) {
		g.drawOval(100,200,50,50);
		// will overwrite the colors. 
		g.setColor(Color.RED);
	}
	
	public void drawArc(int xTopLeft, int yTopLeft, int width, int height, int startAngle, int arcAngle, Graphics g) {
		g.drawArc(10, 20, 30, 40, 0, 360);
		g.setColor(Color.CYAN);
	}
	
	// draw a bevel 3D rectangle 
	public void draw3DRect(int xTopLeft, int yTopLeft, int width, int height, boolean raised, Graphics g) {
		g.draw3DRect(10, 20, 10, 20, true);
		
	}
	public void drawRoundRect(int xTopLeft, int yTopLeft, int width, int height, int arcWidth, int arcHeight,
			Graphics g) {
		g.drawRoundRect(10, 20, 10, 20, 0, 180);
	}
	
	public void drawPolygon(int[] xPoints, int[] yPoints, int numPoint, Graphics g) {
		int[] x = {10,20,30};
		int[] y = {40,50,70};
		
		g.drawPolygon(xPoints, yPoints, 6);
	}
	  
	// Filling primitive shapes:
	public void fillRect(int xTopLeft, int yTopLeft, int width, int height, Graphics g) {
		g.fillRect(10, 50, 40, 100);
		g.setColor(Color.ORANGE);
	}
	
	public void fillOval(int xTopLeft, int yTopLeft, int width, int height, Graphics g) {
		g.fillOval(10, 20, 10, 20);
		g.setColor(Color.RED);
	}
	public void fillArc(int xTopLeft, int yTopLeft, int width, int height, int startAngle, int arcAngle,
			Graphics g) {
		g.fillArc(10, 20, 10, 20, 0, 270);
		g.setColor(Color.LIGHT_GRAY);
	}
	
	public void fill3DRect(int xTopLeft, int yTopLeft, int width, int height, boolean raised,
			Graphics g) {
		g.fill3DRect(10, 20, 10, 20, true);
		g.setColor(Color.YELLOW);
	}
	
	public void fillRoundRect(int xTopLeft, int yTopLeft, int width, int height, int arcWidth, int arcHeight,
			Graphics g) {
		g.fillRoundRect(10, 20, 10, 20, 0, 360);
	}
	public void fillPolygon(int[] xPoints, int[] yPoints, int numPoint, Graphics g) {
		int[] x = {10,20,30,40,50};
		int[] y = {100,200,300,400,500};
		g.fillPolygon(x, y, 5);
	}
	
	// main to run them all 
	public static void main(String[] args) {
		// For completeness, run all functions, but the following code should be enough to get general idea
		// of how the HCI / usability based Graphics ADT works. 
		Graphics g = null;
		GraphicsADT graphics = new GraphicsADT(g);
		graphics.drawString("Hello", 10, 20, g);
		graphics.drawLine(10, 20, 30, 40, g);
	}

}
