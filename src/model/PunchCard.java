package model;

public class PunchCard {
	private int punches;
	
	public PunchCard() {
		punches = 0;
	}
	
	public void addPunch() {
		punches++;
	}
	
	public boolean hasFreeDrink() {
		return punches == 10;
	}
	
	public void refreshCard() {
		punches = 0;
	}
	
	public int getNumberOfPunches() {
		return punches;
	}
}
