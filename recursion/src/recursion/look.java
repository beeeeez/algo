package recursion;

public class look {

	public static void main(String[] args) {
		
		System.out.println(dotheThing("1",5));
		
	}
	
	public static String dotheThing(String jimmy,int iterations) {	
		if(iterations==0) {
			return jimmy;
		}
		StringBuilder result= new StringBuilder();
		
		 
		char repeat= jimmy.charAt(0);
		jimmy= jimmy.substring(1) + " ";
		int times= 1;	 
		for(char actual: jimmy.toCharArray()){
			if(actual != repeat){
				result.append(times + "" + repeat);
				times= 1;
				repeat= actual;
			}else{
				times+= 1;
			}
		}
		System.out.println(result.toString());
		return dotheThing(result.toString(),iterations-1);
	}
}
