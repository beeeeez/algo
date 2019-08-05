package lab2;

public abstract class invoice {
	discount invoiceDiscount;
	freight invoiceFreight;
	double extension, weight;

	
	public invoice(double e, double w) {
		extension=e;
		weight=w;
	}
	public void applyDiscount() {
		System.out.println("the discount is: "+invoiceDiscount.calculateDiscount(extension));
	}
	public void applyFreight() {
		System.out.println("the freight charge is :"+invoiceFreight.calculateFreight(weight));
	}
	public void totalInvoice() {
		System.out.println("the total of the invoice is :"+(extension+invoiceFreight.calculateFreight(weight)-invoiceDiscount.calculateDiscount(extension)));
	}
	public void who() {
		
	}

}
