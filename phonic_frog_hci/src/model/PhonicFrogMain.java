/**
 * Model GUI Class for HCI / UI Prep Assignment 1 (Phonics Frog Application) 
 * TO DO: Fill in the remainder of the main code, using Java AWT / Swing methods, and the stubs, plus
 * additional helper methods if necessary, to fulfill the requirements within the assignment. 
 * 
 * Be sure to test the GUI, using PDP methodogy and design methods (factory method would be handy). 
 * Author: Jason Lu (jasonlu968@gmail.com). 
 * 
 * Bug to fix (as an exercise): think of a more efficient way to "gracefully" exit the program
 * without repeated calls to System.exit(0); 
 * 
 * Solution: use try / except, breaks judiciously. 
 * 
 * Date: 8.02.2019 - 8.21.2019 (revised deadline due to GUI configuration) 
 */

package model;

import java.awt.*;
// Scanner object for options. 
import java.util.*; 
// Remaining necessary imports 
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import controller.GraphicsController;

import java.util.HashMap;
import java.util.Map;

public class PhonicFrogMain extends JFrame implements MouseListener {
	
    /**
	 * Add in any variables for the GUI initialization. 
	 */
	private static JPanel controlPanel = new JPanel();
	private static int wordIndex = 0;
	private static String fontType = "Courier New";
	private static int fontSize = 36;
	private static Color fontColor = Color.green;
	private static final long serialVersionUID = 1L;

	private final static int MAX_ALPHABETS = 26;
	
	// Add in the list of phonics here. 
	String[] phonics = {"ei","bi","ci","di","i","ef","yi","eich","ai",
	           "yei","kei","el","em","en","ou","pi","kiu",
	           "ar","es","ti","iu","vi","dabol iu","eks","uai","zi"};
	
	static String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N",
			"O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	
	static // Word list to map the phonics to the alphabets 
	Map<String, String> wordlist = new HashMap<String, String>();
	
	/**
	 * Constructor to directly map the phonics to the words. 
	 * @param 
	 */
	public PhonicFrogMain() {
		initUI();
		for (int i = 0; i < MAX_ALPHABETS; i++) {
			Integer I = i;
			wordlist.put(phonics[i], I.toString());
		}
	}
	
	/**
	 * Fill in this code, using PDP style formatting. 
	 * @param phrase
	 * @param phonics
	 * @param number_of_words
	 */
	// Method to directly translate from word to phonics.
	public static void directTranslatePhonics(String phrase, String[] phonics, int number_of_words) {
		if (number_of_words < 0) {
			System.out.println("No words found. Cannot do translation of " + phrase.toString());
		}
		// initialize the UI 
		initUI();
		// put in wordlist map the word to phonics 
		for (int i = 0; i < MAX_ALPHABETS; i++) {
			Integer I = i;
			wordlist.put(alphabet[i], phonics.toString());
		}
	}
	
	/**
	 * Fill in this code, using PDP style formatting. 
	 * @param phrase
	 * @param phonics
	 * @param number_of_words
	 */
	// Method to directly translate from phonics to words. 
	public static void directTranslateWords(String[] phonics, String phrase, int number_of_words) {
		if (number_of_words < 0) {
			System.out.println("No words found. Cannot do translation of " + phrase.toString());
		}
		// initialize the UI 
		initUI();
		// put in wordlist map the word to phonics 
		for (int i = 0; i < MAX_ALPHABETS; i++) {
			Integer I = i;
			wordlist.put(alphabet[i], phonics.toString());
		}
	}
	
	/**
	 * Fill in this code, using PDP style formatting. 
	 * @param word
	 * @return
	 */
	// Method to print out translated phonics
	public static String printout(String[] word) {
		return word.toString().concat(" ");
	}
	
	public static void main(String[] args) {
		
		// Scanner to tokenize and parse user input, very important in HCI Java coding! 
		Scanner sc = new Scanner(System.in);
		
		DrawingGui panel = new DrawingGui();
		
		/* Welcoming script to the Phonics Frog Main API program. 
		 * Change it into a custom one if you like. */
		String script = "Welcome to the Phonics Frog Main API program.";
		
		System.out.println(script);
		
		/* Options */
		String options = "For options, here is a selection that you can choose from for the Phonics Frog"
				+ "Application: "
				+ "\n 1) Directly translate word to phonics.\n"
				+ "\n 2) Directly translate phonics to words.\n"
				+ "\n 3) Print out phonics translation \n";
		
		System.out.println(options);
		
		int option = sc.nextInt();
		
		if (option == 1) {
			System.out.println("Option 1: Directly translate word to phonics.");
			// call function to directly translate (which you will fill in) 
			System.out.print("Please enter the word: "); 
	    	String phrase = sc.next();
	    	System.out.println();
			String[] phonics = new String[10];
			for (int i = 0; i < 10; i++) {
				phonics[i] = sc.next();
			}
			directTranslatePhonics(phrase, phonics, 50);
			System.out.print("Your translated word is: ");
			System.exit(0);
		}
		
	    if (option == 2) {
	    	System.out.println("Option 2: Directly translate phonics to words.");
			// call function to directly translate (which you will fill in) 
	    	System.out.print("Please enter the phrase: "); 
	    	String phrase = sc.next();
	    	System.out.println();
			String[] phonics = new String[10];
			for (int i = 0; i < 10; i++) {
				phonics[i] = sc.next();
			}
			directTranslateWords(phonics, phrase, 50);
			System.out.print("Your translated phonics is: ");
			System.exit(0);
	    }
	    
	    if (option == 3) {
	    	System.out.println("Option 3: Print out phonics translation.");
			// call function to directly translate (which you will fill in) 
	    	System.out.print("Please enter the phrase: "); 
	    	String phrase = sc.next();
	    	String[] phonics = new String[(phrase.length())];
	    	for (int i = 0; i < phrase.length(); i++) {
	    		
	    	}
			@SuppressWarnings("unused")
			String printout = printout(phonics);
			System.out.print("The translated phonics are: "); 
			System.exit(0);
	    }
		
	    // Add more advanced options if you so choose. 
	    
	    else { 
	    	System.out.println("Option is not readable, please try again.");
	    	System.exit(0);
	    }
	    
	    // GUI option 
        PhonicFrogMain gc = new PhonicFrogMain();
        gc.pack();
        gc.setLocationRelativeTo(null);
        gc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gc.setVisible(true);
        // Add colors to make it more like Phonic Frog 
        gc.getColorModel();
        gc.setBackground(Color.GREEN);
        gc.setTitle("Phonics Frog Graphics Controller");
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
	
	// Design helper function to initialize the UI (will fix later).
	private static void initUI(){
		createMenuBar();
	}

	private static void createMenuBar() {
		// TODO Auto-generated method stub
		JMenuBar menuBar = new JMenuBar();
		// button choices for the GUI. 
		JMenu menuTranslate = new JMenu("Translate");
		JMenu menuFont = new JMenu("Font");
	}
}
