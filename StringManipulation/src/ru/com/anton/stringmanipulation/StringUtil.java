package ru.com.anton.stringmanipulation;

import java.util.Iterator;

public class StringUtil {

	public static void main(String[] args) {
		String sourse = "Hello wanderful world!";
		
		String[] wordStrings = sourse.split(" ");
		System.out.println(wordStrings.length + " слова");
		
		for(int i = 0; i < wordStrings.length; i++) {
			char[] letters = wordStrings[i].toCharArray();
			System.out.println("В слове " + wordStrings[i] + " " + letters.length + " букв");
		}
		
		
		

	}

}
