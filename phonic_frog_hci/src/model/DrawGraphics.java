/**
 * Model GUI Class for HCI / UI Prep Assignment 1 (Phonics Frog Application) 
 * Sample coding to show how to make the Java JFrame and GUI applet with Graphics interface.
 * Be sure to consider the design principle of usability when coding the GUI. 
 * 
 * Author: Jason Lu (jasonlu968@gmail.com) 
 * Date: 8.02.2019 - 8.16.2019  
 * 
 * Source: https://examples.javacodegeeks.com/desktop-java/swing/java-awt-graphics-example/
 * 
 */

package model;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

class DrawRect extends JComponent {

	private static final long serialVersionUID = 1L;

  public void paint(Graphics g) {
	  
	g.drawString("Phonics Frog Main Application",10,10);
	g.setColor(Color.YELLOW); 	
	
	System.out.println("\n");
	
    g.drawRect (10, 10, 200, 200);  
    g.setColor(Color.BLUE);
    g.fillRect(10, 10, 200, 200);
    
    System.out.println("\n");
    
    // Lion King fun :-) 
    g.drawString("Can you feel the love tonight?",400,400);
    g.drawString("",400,450);
    g.drawString("It's all we are.",400,500);
    g.drawString("",400,550);
    g.drawString("There's a calm surrender.",400,600);
    g.drawString("",400,650);
    g.setColor(Color.DARK_GRAY);
  }
}

public class DrawGraphics {
  public static void main(String[] a) {
    JFrame window = new JFrame();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setBounds(30, 30, 300, 300);
    window.getContentPane().add(new DrawRect());
    window.setVisible(true);
  }
}