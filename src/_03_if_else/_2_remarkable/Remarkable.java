package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String ex1 = "He is kind";
		String ex2 = "He is smart";
		String ex3 = "She is hardworking";
				
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String input = JOptionPane.showInputDialog("Enter a name out of the following (ex1,ex2,ex3)");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
		if(input.equals("ex1")) {
			JOptionPane.showMessageDialog(null, ex1);
		}
		if(input.equals("ex2")) {
			JOptionPane.showMessageDialog(null, ex2);
		}
		if(input.equals("ex3")) {
			JOptionPane.showMessageDialog(null, ex3);
		}
	}
}

