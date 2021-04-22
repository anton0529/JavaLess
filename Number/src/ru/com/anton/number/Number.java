package ru.com.anton.number;

import javax.swing.JOptionPane;

public class Number {


	public static void main(String[] args) {
		
	String inString;
	inString = JOptionPane.showInputDialog(null, "Введите число", JOptionPane.QUESTION_MESSAGE);
	
	if(inString != null && !inString.equals("")) {
	double n = Double.parseDouble(inString);
	if (n > 0) {
		System.out.println("Вы ввели положительное число!");
	} else if(n == 0) {
		System.out.println("Вы ввели 0");
	}else {
		System.out.println("Вы ввели отрицательное число");
		
	}
	
}
	}

}
