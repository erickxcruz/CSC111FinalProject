package pkgParkingReservation;

public class Permit {

	private int permitid;
	private String fullname;
	private String password;
	
	
	public Permit() {
		super();
		this.permitid = 0;
		this.fullname = "";
		this.password = "";
	}
	
	public Permit(int permitid, String fullname, String password) {
		super();
		this.permitid = permitid;
		this.fullname = fullname;
		this.password = password;
	}


	public int getPermitID() {
		return permitid;
	}


	public void setPermitID(int permitid) {
		this.permitid = permitid;
	}


	public String getFullName() {
		return fullname;
	}
	public void setfullname(String fullname) {
		this.fullname = fullname;
	}
	
	public String getPassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
}
