package model;

import java.util.HashMap;

public class Menu {
	
	private HashMap<String, Coffee> items;
	
	public Menu() {
		items = new HashMap<>();
		items.put("Mocha", new Mocha());
		items.put("Americano", new Americano());
		items.put("Cold Brew", new ColdBrew());
	}
	
	public double getPrice(String in) {
		return items.get(in).getPrice();
	}
}
