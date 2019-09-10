package linkedListHW;

public class homeworkList<E> extends LinkedList<E>{
	
	public int sum() {
		moveToStart();
		next();
		int sum=0;				
		for(int i =0;i<cnt; i++) {
			System.out.println("sum current element - " +curr.element());
			sum+=(int)curr.element();
			next();
		}
		return sum;
		

		
	}
	
	public int max() {
		moveToStart();
		next();
		int jammy=0;
		for(int i=0;i<cnt; i++) {			
			if((int)curr.element()>jammy) {
				
				jammy=(int)curr.element();
			}
			next();
		}
		return jammy;
		
	}
	
	public int min() {
		moveToStart();
		next();
		int jammy=0;
		for(int i=0;i<cnt; i++) {	
			if(i==0) {
				jammy=(int)curr.element();
			}
			if((int)curr.element()<jammy) {
				jammy=(int)curr.element();
			}
			next();
		}
		return jammy;
		
	}
	
	public void removeDuplicates() {
		moveToStart();
		next();
		LinkedList<E> jimmy = new LinkedList<E>();
		boolean doop=false;
		int holdCnt=cnt;
		System.out.println(holdCnt);
		for(int i=0;i<holdCnt; i++) {	
			doop=false;
			System.out.println("main list position "+currPos()+ " current value "+curr.element());
			jimmy.moveToStart();
			for(int j=0;j<=jimmy.cnt;j++) {
				System.out.println("jimmy's current value "+jimmy.getValue());
			if(jimmy.getValue()==curr.element()) {
				System.out.println("removing : "+curr.element() + " at main list position "+currPos());
				prev();
				remove(); 
				doop=true;
				j=jimmy.cnt;
			}
			jimmy.next();
			}
		
		if(doop==false) {
			jimmy.append(curr.element());
			System.out.println("adding to jimmy list : "+curr.element()+" at position "+jimmy.cnt);
		}
		next();
		
		}
		
		
	}
	
	public void sort() { //damnit I dont wanna sort this jeez
		int min = min(), max=max();
		int[] sorted = new int[3];
		moveToStart();
		next();
		for(int j=0;j<=cnt;j++) {
			switch((int)curr.element()) {			
			case 5:
				sorted[0]=sorted[0]+1;
			
			case 10:
				sorted[1]=sorted[1]+1;
				
			case 15:
				sorted[2]=sorted[2]+1;
					
			
			default: 
			
			
			}
			next();			
		}
		
		
	}
	
	

	
}
