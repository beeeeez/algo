package lab2;

public class NationalFootballLeague extends invoice {
	 public NationalFootballLeague(double e, double w) {
		super(e, w);
		invoiceDiscount = new twentyPercent();
		invoiceFreight = new AmericanAirlines();		
	}
	 public void who() {
		 System.out.println("Go Pats!");
	 }



}
