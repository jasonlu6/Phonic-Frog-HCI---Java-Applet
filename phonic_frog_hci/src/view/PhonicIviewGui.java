/**
 * Controller Class for HCI / UI Prep Assignment 1 (Phonics Frog Application) 
 * TO DO: Fill the stubs for the main body of the code, and ensure both GUI and Console 
 * coding works properly. Troubleshoot with some unit test cases or simple phonic translations. 
 * 
 * Be sure to test the GUI, using PDP methodogy and design methods (factory method would be handy). 
 * Author: Jason Lu (jasonlu968@gmail.com). 
 * 
 * Bug to fix (as an exercise): think of a more efficient way to "gracefully" exit the program
 * without repeated calls to System.exit(0); 
 * 
 * Date: 8.02.2019 - 8.16.2019  
 */

package view;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class PhonicIviewGui extends JFrame implements MouseListener {

	/**
	 * General serial version UID (optional, compiler optimized) 
	 */
	private static final long serialVersionUID = 1L;

	/** Constructor for the Phonics Frog Main application view.*/
	public PhonicIviewGui(Color colorGui, Color textGui, String input, String[] phonics, int words){
		colorGui = Color.GREEN;
		textGui = Color.YELLOW;
		input = "";
		phonics = new String[0];
		words = 0;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
