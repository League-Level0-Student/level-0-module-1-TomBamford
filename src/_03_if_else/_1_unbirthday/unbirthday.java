package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class unbirthday {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("What is your birthday? (mm/dd)");
	if(input.equals("07/18")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Happy Unbirthday!");
	}
	
}
}
