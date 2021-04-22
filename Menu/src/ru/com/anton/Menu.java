package ru.com.anton;

import java.io.IOException;

public class Menu {

	public static void main(String[] args) throws IOException {
			int choice;
		do {
			System.out.println("Справка по оператору:");
			System.out.println("     1. IF");
			System.out.println("     2. SWITCH");
			System.out.println("     3  WHILE");
			System.out.println("     4. DO-WHILE");
			System.out.println("     5. FOR \n");
			System.out.println("Выберите нужный пункт");
			choice = (int) System.in.read();
		} while (choice < 1 || choice > 5);
		
		System.out.println("\n");
		switch(choice) {
			case 1:
				System.out.println("if: \n");
				System.out.println("If(Условие) оператор;");
				System.out.println("else оператор;");
				break;
			case 2:
				System.out.println("switch \n");
				System.out.println("switch(выражение) { ");
				System.out.println(" case константа :");
				System.out.println(" последовательность операторов");
				System.out.println(" break;");
				System.out.println("// ... ");
				System.out.println("}");
				break;
			case 3:
				System.out.println("while \n");
				System.out.println("while (условие) оператор;");
				break;
			case 4:
				System.out.println("do-while \n");
				System.out.println("do {");
				System.out.println(" оператор");
				System.out.println("} while (условие)");
				break;
			case 5:
				System.out.println("for \n");
				System.out.println("for (инициализация; условие; итерация;");
				System.out.println(" оператор");
				break;
			}
	}

}
