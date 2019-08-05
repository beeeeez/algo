package lab2;

public class NaragansettLager extends invoice {
	 public NaragansettLager(double e, double w) {
		super(e, w);
		invoiceDiscount = new fiftyPercent();
		invoiceFreight = new Amtrak();		
	}
	 public void who() {
		 System.out.println("Made on Honor. Sold on Merit.");
	 }



}
