package recursion;

public class look {

	public static void main(String[] args) {
		
		dotheThing("1",5);
		
	}
	
	public static String dotheThing(String jimmy,int iterations) {	
		if(iterations==0) {
			return jimmy;
		}
		String jammy="";
		
		 
		char hold= jimmy.charAt(0);
		jimmy= jimmy.substring(1) + " ";
		int i= 1;	 
		for(char chr: jimmy.toCharArray()){
			if(chr != hold){
				jammy+=i + "" + hold;
				i= 1;
				hold= chr;
			}else{
				i+= 1;
			}
		}
		System.out.println(jammy);
		return dotheThing(jammy,iterations-1);
	}
}
