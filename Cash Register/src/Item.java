
public class Item {
	
	private String itemName;
	private double itemPrice;
	
	public Item() {
		
	}
	
	public Item(String itmName, double price) {
		this.itemName = itmName;
		this.itemPrice = price;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
}
