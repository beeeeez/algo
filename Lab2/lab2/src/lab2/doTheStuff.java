package lab2;

public class doTheStuff {

	public static void main(String[] args) {
		invoice AAA1 = new JCPenny(20, 50);
		AAA1.who();
		AAA1.applyDiscount();
		AAA1.applyFreight();
		AAA1.totalInvoice();
		
		invoice BBB2 = new NaragansettLager(200, 25);
		BBB2.who();
		BBB2.applyDiscount();
		BBB2.applyFreight();
		BBB2.totalInvoice();

		invoice CCC3 = new NationalFootballLeague(500, 200);
		CCC3.who();
		CCC3.applyDiscount();
		CCC3.applyFreight();
		CCC3.totalInvoice();
		
	}
}
