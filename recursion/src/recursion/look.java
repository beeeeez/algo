package recursion;

public class look {

	public static void main(String[] args) {
		
		System.out.println(dotheThing("1",5));
		
	}
	
	public static String dotheThing(String jimmy,int iterations) {		
		String jammy="";
		char hold=jimmy.charAt(0);
		int count=0;
		for(int i=0;i<jimmy.length();i++) {
			count++;
			if(hold!=jimmy.charAt(i)) {			
				jammy+=jimmy.charAt(i);
				jammy+=count;
				hold=jimmy.charAt(i);
				count=0;
			}
			
		}
		iterations--;
		if(iterations==0) {
			return jammy;
		}
		return dotheThing(jammy, iterations);
	
		
		/*
		if(i==0) {
			return jimmy;
		}		
		for(int j=0;j<jimmy.length();j++) {
			if(x==(int)jimmy.charAt(j)) {
				c++;
			}
			else {
				jammy+=((int)jimmy.charAt(j)-1);
				jammy+=c;
				x = (int)jimmy.charAt(j);
			}
			
		}
		
		
		i--;
		return dotheThing(jammy,i);
	*/
			
	}
}
