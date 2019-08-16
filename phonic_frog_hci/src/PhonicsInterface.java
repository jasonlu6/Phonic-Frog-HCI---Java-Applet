/**
 * Interface for HCI / UI Prep Assignment 1 (Phonics Frog Application) 
 * TO DO: Complete this interface coding once the main coding has been set. Change as you see fit, since 
 * the assignment persumes you already know how to modify and use a Java interface.
 * 
 * Interface methods. Add them as you see fit. 
 * 
 * Date: 8.02.2019 - 8.16.2019  
 */

public interface PhonicsInterface {
	
	// Add in interface methods here. Think about the design carefully here. 
	void directTranslatePhonics(String phrase, String[] phonics, int number_of_words);
	
	void directTranslateWords(String[] phonics, String phrase, int number_of_words);

	String printout(String[] word);
}
