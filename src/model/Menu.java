package model;

import java.util.HashMap;

public class Menu {
	
	private HashMap<String, MenuItem> items;
	
	public Menu() {
		items = new HashMap<>();
		items.put("James's Jicama Sandwich", new JamesJicama());
		items.put("Austen's Austere Sandwich", new AustensAustere());
		items.put("Tim's Torture Sandwich", new TimsTorture());
		items.put("Ryan's Roast Sandwich", new RyansRoast());
	}
	
	public double getPrice(String in) {
		return items.get(in).getPrice();
	}
	
	public String getQuip(String in) {
		return items.get(in).toString();
	}
	
	public String toString() {
		String ret = "Menu:\n";

		for(String item: items.keySet()) {
			ret += "  " + item + "\n";
		}
		return ret;
	}
}
