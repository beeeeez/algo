package datastructures;

public class dotheThing {
	
	
	public static void main(String[] args) {
		homeworkList jimmy = new homeworkList();
		jimmy.moveToStart();
		jimmy.insert(10);
		for(int i=1;i<10;i++) {	
			if(i==6) {
				jimmy.append(5);
			}
			
			else if(i==3) {
				jimmy.append(15);
			}
			else {
			jimmy.append(10);
			}
		}
		System.out.println("total count :" +jimmy.cnt);
		System.out.println("sum :" +jimmy.sum());
		System.out.println("max :" +jimmy.max());
		System.out.println("min :" +jimmy.min());
		System.out.println("removing duplicates");
		jimmy.removeDuplicates();
		System.out.println("total count :" +jimmy.cnt);
		System.out.println("sum :" +jimmy.sum());
		System.out.println("max :" +jimmy.max());
		System.out.println("min :" +jimmy.min());
	}
}
