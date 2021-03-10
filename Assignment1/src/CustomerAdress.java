
public class CustomerAdress extends Names {
	// person's name
	private String town;
	private int pincode;
	private String State;
	private String location;
	private ITEMTYPE itemtype;
	private int num;

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void status(int num) {
		if (num == 1) {
			System.out.println("Dispatched");
		} else if (num == 2) {
			System.out.println("Delivered");
		} else if (num == 3) {
			System.out.println("In Transit");
		}

	}

	CustomerAdress(String name, int pincode) {
		setName(name);
		setItemtype(itemtype);
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public ITEMTYPE getItemtype() {
		return itemtype;
	}

	public void setItemtype(ITEMTYPE itemtype) {
		this.itemtype = itemtype;
	}

}
