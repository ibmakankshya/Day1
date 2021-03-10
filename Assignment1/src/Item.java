import java.util.Date;

public class Item extends Names {
	// item name
	Item(String name, int cost) {
		setName(name);
		setCost(cost);
	}

	private int cost;
	private double ID;

	public double getID() {
		return ID;
	}

	public void setID(double iD) {
		ID = iD;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Date getDatebought() {
		return datebought;
	}

	public void setDatebought(Date datebought) {
		this.datebought = datebought;
	}

	private Date datebought;

}
