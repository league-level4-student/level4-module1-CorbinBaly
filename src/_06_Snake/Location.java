package _06_Snake;

public class Location {
	public int x;
	public int y;
	
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Location loc) {
		if(x == loc.x && y == loc.y) {
			return true;
		}
		return false;
	}
}
