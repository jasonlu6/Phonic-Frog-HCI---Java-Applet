/**
 * Model GUI Class for HCI / UI Prep Assignment 1 (Phonics Frog Application) 
 * TO DO: Implement a working version of the drawing panel UI here, which means green box, the 
 * lettering for the alphabets, an input screen, and the yellow title text. Nothing too fancy,
 * just functional with the Java Applet. 
 * 
 * Be sure, to ensure, however, that the coding does compile. 
 * Author: Jason Lu (jasonlu968@gmail.com) 
 * Date: 8.02.2019 - 8.16.2019  
 * 
 * Source: https://examples.javacodegeeks.com/desktop-java/swing/java-awt-graphics-example/
 * 
 */

package model;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.applet.*;

/* TO DO: Implement all of the coloring and text functions as you see fit,
 * change parameters to general form instead of specific colors and text. */ 

public class DrawingGui extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int length;
	private int width;
	
	public DrawingGui() {
	}

	public void setBackgroundColor(Color green, Graphics g) {
		// TODO Auto-generated method stub
		DrawingGui dp = new DrawingGui();
		g.setColor(Color.GREEN);
	}

	public void setTextColor(Color yellow, Graphics g) {
		// TODO Auto-generated method stub
		DrawingGui dp = new DrawingGui();
		g.setColor(Color.YELLOW);
	}
	
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(30, 30, 300, 300);
		window.getContentPane().add(new DrawPicture());
		window.setVisible(true);
		}
	}

/** Separate class to actually draw the graphics for Phonics Frog Application. */
class DrawPicture extends JComponent {
	
/**
 * Make a simple GUI with green box and yellow text. 
 */
public void drawPhonicsGui(Graphics g) {
    g.drawRect(10, 10, 60, 50);
    g.fillRect(100, 10, 60, 50);
    g.drawRoundRect(190, 10, 60, 50, 15, 15);
    g.fillRoundRect(70, 90, 140, 100, 30, 40);
}
	
	

}
