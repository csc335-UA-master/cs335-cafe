package model;

import java.util.HashMap;

public class Menu {
	
	private HashMap<String, MenuItem> items;
	
	public Menu() {
		items = new HashMap<>();
		items.put("CarsonsCheeseSteak", new CarsonsCheeseSteak());
		items.put("AnhsChovy", new AnhsChovy());
		items.put("HungsHamAndSwiss", new HungsHamAndSwiss());
		items.put("MinhsMeatball", new MinhsMeatball());
		items.put("OmsOmelet", new OmsOmelet());
		items.put("DensonsDagwood", new DensonsDagwood());
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
