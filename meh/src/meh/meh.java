package meh;

public class meh {

	public static void main(String[] args) {
		long start = System.nanoTime();
		double jay = jimmy(3,6);
		long end = System.nanoTime();
		System.out.println(jay + " --time: "+(end-start));
		start = System.nanoTime();
		double fay=jammy(3,6);
		end = System.nanoTime();
		System.out.println(fay + " --time: "+(end-start));
		
	}
	public static double jimmy(double jim, int n ) {
		if(n==0) {
			return 1;
		}
		n--;
		return jim * jimmy(jim, n);
	}
	
	public static double jammy(double jim, int n) {
		double fuh=1;
		for(int i=n;i>0;i--) {
			fuh = fuh*jim;
		}
		return fuh;
		
		
		
	}
}
