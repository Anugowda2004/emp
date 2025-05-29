package transaction;

public class UpiPayment implements Payment {
	String upiName;
	String upiId;
	
	public UpiPayment(String upiName,String upiId)
	{
		this.upiName = upiName;
		this.upiId = upiId;
	}

	public static void main(String[] args) {
		System.out.println("Upi Payment Initiated");
		// TODO Auto-generated method stub
	}
	public void process(double amt) {
		// TODO Auto-generated method stub
		System.out.println("Payment of "+amt+" was done using "+upiName+" and ref no is : "+upiId);
	}

}
