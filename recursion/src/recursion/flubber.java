package recursion;

public class flubber {
	
	public static void main(String[] args) {
		
		String flub = "Hello World";
		String jammy="";
		System.out.println(reverse(flub,jammy,flub.length()-1));
	}
	
	public static String reverse(String jimmy, String jammy, int i) {		
		jammy+=jimmy.valueOf(jimmy.charAt(i));
		if(i==0) {
			return jammy;
		}		
		i--;
		System.out.println(i);
		return reverse(jimmy,jammy,i);	
		
	}

	
	
	
}