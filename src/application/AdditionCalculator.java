package application;

import javax.swing.JOptionPane;

public class AdditionCalculator {

	public static void main(String[] args) {
		String firstNumberInput;
		do {
			firstNumberInput = JOptionPane.showInputDialog("Enter first integer:");
			
			if (!firstNumberInput.matches("-?\\d+")) {
				JOptionPane.showMessageDialog(null, "Invalid value! Please enter only integers!");
			}
		} while(!firstNumberInput.matches("-?\\d+"));
		
		String secondNumberInput;
		do {
			secondNumberInput = JOptionPane.showInputDialog("Enter second integer:");
			
			if (!secondNumberInput.matches("-?\\d+")) {
				JOptionPane.showMessageDialog(null, "Invalid value! Please enter only integers!");
			}
		} while(!secondNumberInput.matches("-?\\d+"));
		
		int firstSummand = Integer.parseInt(firstNumberInput);
		int secondSummand = Integer.parseInt(secondNumberInput);
		int sum = firstSummand + secondSummand;
		
		String message = String.format("%d plus %d equals %d", firstSummand, secondSummand, sum);
		JOptionPane.showMessageDialog(null, message);
	}
}
