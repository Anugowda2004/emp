package transaction;

public class main {

	public static void main (String[] args) {
		CreditCard credit = new CreditCard("Anu","4856 7851 3424 5436");
		UpiPayment upi = new UpiPayment("Ppay","bg2rtyu5juy6hg8");
		credit.process(18000);
		upi.process(34000);
	}

}
