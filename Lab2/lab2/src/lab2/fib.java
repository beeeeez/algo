package lab2;

public class fib {

	public static int fibi(int i) {
		System.out.println(i);
		if (i<=1) {			
			return fibi(i);
		}
		else if(i<100){
			return fibi(i-1)+fibi(i-2);
		}
		else {
			return 0;
		}
	}
	
	public static void main(String[] args) {		
		System.out.println(fibi(1));
	}	
}
