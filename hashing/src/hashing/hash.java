package hashing;

public class hash {

	
	public int  simple(String key) {
		System.out.println("The key : ");

		int sum = 0;
		for(int i = 0;i<key.length();i++) {
			int decVal = key.charAt(i);
			sum=sum+decVal;
			System.out.println("char "+(char)key.charAt(i)+ " = "+decVal);
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		hash jimmy = new hash();
		int index=jimmy.simple("1007");
		System.out.println("index gen from key = "+index);
	}
}
