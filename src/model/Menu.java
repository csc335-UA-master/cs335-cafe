package model;

import java.util.HashMap;

public class Menu {
	
	private HashMap<String, Coffee> items;
	
	public Menu() {
		items = new HashMap<>();
		items.put("mocha", new Mocha());
		items.put("Americano", new Americano());
		items.put("iced", new ColdBrew());
	}
	
	public double getPrice(String in) {
		return items.get(in).getPrice();
	}
}
