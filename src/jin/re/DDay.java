package jin.re;

import java.util.HashMap;

public class DDay {
	private String name;
	private String date;
	private HashMap<String, Location> locations = new HashMap<String, Location>();
	
	public DDay() {
		this.name = null;
		this.date = null;
		this.locations = null;
	}
	public DDay(String name, String date) {
		this.name = name;
		this.date = date;
	}	
	
	public void addLocation(Location location) {
		this.locations.put(location.getName(), location);
	}
	public Location getLocation(String locationName) {
		return this.locations.get(locationName);
	}
	public void removeLocation(String locationName) {
		this.locations.remove(locationName);
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	public void setLocations(HashMap<String, Location> locations) {
		this.locations = locations;
	}
	
	public String getDate() {
		return this.date;
	}
	public HashMap<String, Location> getLocations() {
		return this.locations;
	}
	
	
	public static void main(String args[]) {
		DDay dDay = new DDay("SuperHot", "2018-03-18");
		
		Location location = new Location("Cafe", 12000);
		
		Member ohj = new Member("ohj");
		Member kkw = new Member("kkw");
		
		location.addMember(ohj);
		location.addMember(kkw);
		
		
		
		
	}
}
