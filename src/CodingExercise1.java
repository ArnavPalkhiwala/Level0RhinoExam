/* Level 0 Exam: Coding  Exercise #1 */

/**
 * Write a program that asks the user for their name. 
 * Get a random number and print out their name random number
 * amount of times. When the loop is running at an odd number
 * print out that user is weird.
 **/

/*
 * Example:
 * Name: Esteban
 * Random number: 3
 * 
 * output:
 * Esteban is odd.
 * Esteban
 * Esteban is odd. 
 **/

import java.util.Random;

import javax.swing.JOptionPane;

	public class CodingExercise1 {
		public static void main(String[] args) {
			String name = JOptionPane.showInputDialog("What is your name?");
			Random x = new Random(100); 
			for (int i = 0; i < 100; i++) {
				if ((i % 2)==0) {
					System.out.println(name);
				}	
					if ((i % 2)== 1) {
					System.out.println(name + " is odd");
					
				}
			
			}
				
	
		
		
		
		
		
		
		
		
		
		
		
		
		}
}