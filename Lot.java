package pkgParkingReservation;

public class Lot {
	
	private int lotnum;
	private int spotnum;
	private String lotname;
	private int capacity;
	private int hancapspaces;
	
	public Lot() {
		super();
		this.lotnum = 0;
		this.spotnum = 0;
		this.lotname = "";
		this.capacity = 0;
		this.hancapspaces = 0;
	}
	
	
	public Lot(int lotnum, int spotnum, String lotname, int capacity, int hancapspaces) {
		super();
		this.lotnum = lotnum;
		this.spotnum = 0;
		this.lotname = lotname;
		this.capacity = capacity;
		this.hancapspaces = hancapspaces;
	}
	
	
	public int getLotNum() {
		return lotnum;
	}
	public void setLotnum(int lotnum) {
		this.lotnum = lotnum;
	}
	
	
	public int getSpotNum() {
		return spotnum;
	}
	public void setSpotNum(int spotnum) {
		this.spotnum = spotnum;
	}
	
	
	public String getLotName() {
		return lotname;
	}
	public void setLotName(String lotname) {
		this.lotname = lotname;
	}
	
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
	public int getHanCapSpaces() {
		return hancapspaces;
	}
	public void setHanCapSpaces(int hancapspaces) {
		this.hancapspaces = hancapspaces;
	}
}
