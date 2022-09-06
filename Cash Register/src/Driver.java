import java.util.Scanner;

public class Driver {

	public static void main(String [] args) {
		
		// Tests multiple items being bought 
      //  Item item1 = new Item("Apple", .5);
	  //  System.out.println("Item 1: " +  item1.getItemName() + ": $" + item1.getItemPrice());
	  //  Item item2 = new Item("Pear", .75);
	  //  System.out.println("Item 2: " +  item2.getItemName() + ": $" + item2.getItemPrice());
	  //  Item item3 = new Item("Orange", .75);
	  //  System.out.println("Item 3: " +  item3.getItemName() + ": $" + item3.getItemPrice());
	  //  Item item4 = new Item("Pineapple", 1.75);
	  //  System.out.println("Item 4: " +  item4.getItemName() + ": $" + item4.getItemPrice());
	    
	    // Tests a single item that is expensive
	    Item item5 = new Item("Refrigerator", 800.71);
	    System.out.println("Item 1: " +  item5.getItemName() + ": $" + item5.getItemPrice());
	    
	    System.out.println("");
		Payment pay = new Payment();
		pay.Payment();
	//	System.out.println("Enter the amount you want to pay");
	//	Scanner amntPay = new Scanner(System.in);
	//	double paid = amntPay.nextDouble();
		System.out.println("");
	//	Receipt rTotal = new Receipt();
	//    rTotal.receipt(100);
	    int paid1 = pay.paid;
	    System.out.println(paid1);
	 //   System.out.println("---------------------------------");
	//	System.out.println("Subtotal: " + item5.getItemPrice());
	//	System.out.println("Tax:" + "\t" + (item5.getItemPrice()*.07));
	//	System.out.println("Total:" + "\t" + (item5.getItemPrice() + (item5.getItemPrice()*.07)));
		
		
		
		
	//	System.out.println("Cash:" + "\t"  + "Cash goes here");
		
	//	System.out.println("Debit card:" + "\t" + "Debit card goes here");
		
	//	System.out.println("Credit card:" + "\t" + "Credit card goes here");
		
	//	System.out.println("Check:" + "\t" + "Check goes here");
		
	//	System.out.println("Change:" + "\t" + "Change goes here");
	    
	}
}
