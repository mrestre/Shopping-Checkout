
public class Receipt {

public void receipt(double itemPrice) {
	
	Item item6 = new Item("Refrigerator", 800.71);
	
	
	System.out.println("---------------------------------");
	System.out.println("Subtotal: " + item6.getItemPrice());
	System.out.println("Tax:" + "\t" + (item6.getItemPrice()*.07));
	System.out.println("Total:" + "\t" + (item6.getItemPrice() + (item6.getItemPrice()*.07)));
	
	//Payment
	
	System.out.println("Cash:" + "\t"  + "Cash goes here");
	
	System.out.println("Debit card:" + "\t" + "Debit card goes here");
	
	System.out.println("Credit card:" + "\t" + "Credit card goes here");
	
	System.out.println("Check:" + "\t" + "Check goes here");
	
	System.out.println("Chance:" + "\t" + "Change goes here");
	
	
}
}
