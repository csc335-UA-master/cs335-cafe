package controller;

import java.util.HashMap;
import java.util.Scanner;

import model.Menu;
import model.PunchCard;

public class CashRegister {
	public static void main(String [] args) {
		Menu menu = new Menu();
		HashMap<String, PunchCard> cards = new HashMap<>();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Clarkbucks, what's your name? ");
		
		String id = input.next();
		if (!cards.containsKey(id)) {
			cards.put(id, new PunchCard());
		}
		PunchCard punchCard = cards.get(id);
		
		System.out.print("What would you like to drink? ");
		String userInput = input.next();
		double currentTab = 0;
		while (!userInput.equals("no")) {
			if (!punchCard.hasFreeDrink()) {
				currentTab += menu.getPrice(userInput);
				punchCard.addPunch();
			} else {
				punchCard.refreshCard();
				System.out.println("This one's on us");
			}
			
			System.out.print("Anything else? ");
			userInput = input.next();
		}
		
		System.out.printf("Cool, that will be $%.2f, take care!\n", currentTab);
		input.close();
	}
}
