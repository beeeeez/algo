package lab2;

public class JCPenny extends invoice {
	 public JCPenny(double e, double w) {
		super(e, w);
		invoiceDiscount = new tenPercent();
		invoiceFreight = new UPS();		
	}
	 public void who() {
		 System.out.println("JC Penny");
	 }



}
