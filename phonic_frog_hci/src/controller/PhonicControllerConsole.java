/**
 * Controller Class for HCI / UI Prep Assignment 1 (Phonics Frog Application) 
 * TO DO: Fill in stub code that allow the Phonics Frog Controller to work as intended.
 * See a sample stackoverflow calculator code for reference: 
 * 
 * 
 * Be sure to test the GUI, using PDP methodogy and design methods (factory method would be handy). 
 * Author: Jason Lu (jasonlu968@gmail.com) 
 * Date: 8.02.2019 - 8.16.2019  
 */

package controller;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Collections;

public class PhonicControllerConsole {
	
	private static int words = 0;
	
	/** 
	 * Phonics table: copied over from the main. 
	 * */
	// Add in the list of phonics here. 
		String[] phonics = {"ei","bi","ci","di","i","ef","yi","eich","ai",
		           "yei","kei","el","em","en","ou","pi","kiu",
		           "ar","es","ti","iu","vi","dabol iu","eks","uai","zi"};
		
		static String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L",
				"M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

	// Constructor 
	public PhonicControllerConsole(Color colorGui, String input, String[] phonics, int words) {
		colorGui = Color.GREEN;
		input = "";
		phonics = new String[0];
		words = 0;
	}
	
	// Method to read in console input. 
	public void PhonicReadConsoleInput(String input) {
		Scanner console = new Scanner(System.in);
		try {
			// ensure that the console grammar is within alphabet lowercase and uppercase range. 
			console.next("abcdefghijklmnopqrstuvwxyz");
			console.next("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		} catch (Exception e) {
			System.out.println("Attempted to read console input. Restart GUI and try again.");
			System.exit(0);
		}
		System.out.println("Your console input is: " + console.toString());
		System.out.println("Your console input length is: " + console.toString().length());
		words += 1;
	}
	
	// Method to read in phonics table. 
	private static void ReadPhonicsTable(String[] phonics) {
		String[] phonics1 = {"hah","oh","muh","eh","er"};
		ArrayList arrayList = new ArrayList<>(); 
		Collections.addAll(arrayList, phonics1);
	}
	
	// Method to map the input to the phonics table. Consider using a higher order function here. 
	public String MapInputAlphabetToPhonics(String[] phonics, String[] alphabet) {
		ArrayList mapping = new ArrayList<>();
		for (String s : phonics) {
			// map the phonics and the alphabets 
			Map<String, String> map = new HashMap<>();
			// put all of the phonics and alphabets in a map (A thru Z). 
			/** 
			 * List of phonics (as a reference): 
			 * 
		String[] phonics = {"ei","bi","ci","di","i","ef","yi","eich","ai",
		           "yei","kei","el","em","en","ou","pi","kiu",
		           "ar","es","ti","iu","vi","dabol iu","eks","uai","zi"};
			 */
			map.putAll(map);
			map.forEach((p,a)->System.out.println("Alphabet : " + alphabet + " Phonics : " + phonics));
		}
		return mapping.toString();
	}
	
	// Method to clear input. 
	public void ClearPhonics() {
		phonics = new String[26];
	}
	
	// Any additional methods you see fit. 
	
	// print the list of phonics method. 
	public void printPhonics(){
		for (int i = 0; i < phonics.length; i++) {
			System.out.println(phonics[i]);
		}
	}
	
	// main, run controller console. 
	public static void main(String[] args) {
		PhonicControllerConsole pcc = new PhonicControllerConsole(null, null, args, words);
		String[] homer = {"hah","oh","me","eh","er"};
		// pcc.ReadPhonicsTable(homer);
		pcc.PhonicReadConsoleInput("homer");
		String[] zendaya = {"zen","day","uh"};
		// pcc.ReadPhonicsTable(homer);
		pcc.PhonicReadConsoleInput("zendaya");
		// this will throw the exception! 
		// pcc.PhonicReadConsoleInput("Lebron23");
		// attempt to print out the map 
		pcc.MapInputAlphabetToPhonics(homer, alphabet);
	}
}
