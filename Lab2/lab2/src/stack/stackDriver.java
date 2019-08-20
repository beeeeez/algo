package stack;

public class stackDriver {

	public static void main(String[] args) {
		arrayStack jimmy = new arrayStack(3);
		jimmy.push(15);
		jimmy.push(15);
		jimmy.push(15);
		jimmy.push(15);
		jimmy.push(15);
		jimmy.push(15);
		
		for (int i=0; i<500;i++) {
			jimmy.push(500);			
		}

	}
}
