package controller;

import java.util.HashMap;
import java.util.Scanner;

import model.Menu;
import model.PunchCard;

public class CashRegister {
	public static void main(String [] args) {
		Menu menu = new Menu();
		//TODO: Find a way to store USERS to PUNCHCARD objects
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Clarkbucks, what's your name? ");
		
		String id = input.next();
		
		//TODO: Create a method of retrieving a user's punchcard from your
		// data structure, or creating a new one if it does not exist
		
		System.out.print("What would you like to drink? ");
		String userInput = input.next().toLowerCase();
		double currentTab = 0;
		
		while (!userInput.equals("no")) {
			//TODO: Implement your punchcard class to check if the user has a free drink, 
			// or implement the punchcard appropriately
			
			System.out.println(menu.getQuip(userInput));
			System.out.print("Anything else? ");
			userInput = input.next().toLowerCase();
		}
		
		System.out.printf("Cool, that will be $%.2f, take care!\n", currentTab);
		input.close();
	}
}
