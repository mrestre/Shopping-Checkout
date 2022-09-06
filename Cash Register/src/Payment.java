import java.util.Scanner;

public class Payment {
public int payMeth1;
public int paid;



public void Payment() {
	int num1 = 1;
	System.out.println("Please enter payment type.\n"+ 
	"1. Cash\n"+ 
	"2. Debit Card\n"+
    "3. Credit Card\n"+
	"4. Check");
	
	Scanner payType = new Scanner(System.in);
	int payMeth1 = payType.nextInt();
	System.out.println(payMeth1);
	
	
	if(payMeth1 == 1) {
		System.out.println("Paying with cash");
	} else if(payMeth1 == 2) {
		System.out.println("Paying with debit card");
	} else if(payMeth1 == 3) {
		System.out.println("Paying with credit card");
	} else if(payMeth1 == 4) {
		System.out.println("Paying with check");
	} else {
		System.out.println("The input does not equal 1, 2, 3, or 4");
	}
	
	System.out.println("Enter the amount you want to pay");
	Scanner amntPay = new Scanner(System.in);
	double paid = amntPay.nextDouble();
	
	System.out.println("---------------------------------");
	//System.out.println("Subtotal: " + this.Driver());
	//System.out.println("Tax:" + "\t" + (item5.getItemPrice()*.07));
	//System.out.println("Total:" + "\t" + (item5.getItemPrice() + (item5.getItemPrice()*.07)));


	if(payMeth1 == 1) {
		System.out.println("Cash:" + "\t"  + paid);
	} else if(payMeth1 == 2) {
		System.out.println("Debit card:" + "\t" + "Debit card goes here");
	} else if(payMeth1 == 3) {
		System.out.println("Credit card:" + "\t" + "Credit card goes here");
	} else if(payMeth1 == 4) {
		System.out.println("Check:" + "\t" + "Check goes here");
	} else {
		System.out.println("The input does not equal 1, 2, 3, or 4");
	}
	
	
	System.out.println("Change:" + "\t" + "Change goes here");
}
//public Payment(int payMeth1) {
//	payMeth = payMeth1;
//}

//public void setPayMeth(int payMeth1) {
//	this.payMeth = payMeth1;
//}
//public int getPayMeth() {
//	return payMeth;
//}



}


