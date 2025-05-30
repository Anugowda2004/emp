package transaction;

public class CreditCard implements Payment {
	String cardNo;
	String cardName;
	public CreditCard(String cardNo,String cardName) {
		this.cardName=cardName;
		this.cardNo=cardNo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Credit Card Payment");
	}
	public void process(double amt) {
		// TODO Auto-generated method stub
		System.out.println("Payment of "+amt+" was done using "+cardName+" and card no is :"+cardNo);
}}
