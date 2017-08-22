/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("What is your age?");
		int x = Integer.parseInt(age);
		int y = 2017-x;
		JOptionPane.showMessageDialog(null, "You were born in " +  y + " .");
		if (x > 30) {
		JOptionPane.showMessageDialog(null, "You are too old to play this game!!");
		}
	
	
	
	
	
	
	
	
	}
}
