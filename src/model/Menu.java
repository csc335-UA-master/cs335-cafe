package model;

import java.util.HashMap;

public class Menu {
	
	private HashMap<String, MenuItem> items;
	
	public Menu() {
		items = new HashMap<>();
		items.put("ChancesChurros", new ChancesChurros());
		items.put("GarrettsGuac", new GarrettsGuac());
		items.put("JacobsJalepenos", new JacobsJalepenos());
		items.put("ShanesSalsa", new ShanesSalsa());
		items.put("ElbaraasElote", new ElbaraasElote());
		items.put("AndrewsAlPastor", new AndrewsAlPastor());
		items.put("IsasIztacmole", new IsasIztacmole());
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
