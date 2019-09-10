package sorting;

public class sortPlayer {
	
	public static void main(String[] args) {
		player[] jimmy = new player[10];
		
		player temp = new player();
		temp.setName("Jimmy");
		temp.setAge(5);
		jimmy[0]=temp;
		
		player temp1 = new player();
		temp1.setName("Jammy");
		temp1.setAge(10);
		jimmy[1]=temp1;
		
		player temp2 = new player();
		temp2.setName("Whimmy");
		temp2.setAge(15);
		jimmy[2]=temp2;
		
		player temp3 = new player();
		temp3.setName("Whammy");
		temp3.setAge(20);
		jimmy[3]=temp3;
		
		player temp4 = new player();
		temp4.setName("Simmy");
		temp4.setAge(25);
		jimmy[4]=temp4;
		
		player temp5 = new player();
		temp5.setName("Sammy");
		temp5.setAge(30);
		jimmy[5]=temp5;
		
		player temp6 = new player();
		temp6.setName("Minny");
		temp6.setAge(35);
		jimmy[6]=temp6;
		
		player temp7 = new player();
		temp7.setName("Manny");
		temp7.setAge(40);
		jimmy[7]=temp7;
		
		player temp8 = new player();		
		temp8.setName("Timmy");
		temp8.setAge(45);
		jimmy[8]=temp8;
		
		
		player temp9 = new player();		
		temp9.setName("Tammy");
		temp9.setAge(50);
		jimmy[9]=temp9;
		
		sortPlayer jammy = new sortPlayer();
		System.out.println("-- unsorted -- ");
		jammy.display(jimmy);
		
		jammy.quickSortName(jimmy);
		System.out.println("-- name sorted --");
		jammy.display(jimmy);
		
		jammy.quickSortAge(jimmy);
		System.out.println("-- age sorted --");
		jammy.display(jimmy);
		
		
		
		
	}
	
	void quickSortName(player[] data) {
		if(data.length<2) {
			return;
		}
		int max=0;
		for(int i =1; i<data.length;i++) {
			if( ((Comparable)(data[max].name)).compareTo(data[i].name) <0) {
				max=i;
			}
			swap(data, data.length-1, max);
			quickSortName(data, 0, data.length-2);
				
		}
		
	}
	
	void quickSortName(player[] data, int first, int last) {
		
		int lower = first+1, upper = last;
		swap(data, first, (first+last)/2);
		Comparable bound = (Comparable)data[first].name;
		
		while(lower<=upper) {
			
			while(bound.compareTo(data[lower].name) > 0) {
				lower++;
			}
			while(bound.compareTo(data[upper].name) < 0) {
				upper--;
			}
			if(lower<upper) {
				swap(data, lower++, upper--);
			}
			else {
				lower++;
			}
		}
		swap(data,upper,first);
		if(first<upper-1) {
			quickSortName(data,first,upper-1);
		}
		if(upper+1<last) {
			quickSortName(data,upper+1,last);
		}
	}
	
	void swap (player[] data, int first, int second) {
		player temp = new player();
		temp = data[first];
		data[first] = data[second];
		data[second]=temp;
	}
	
	void display(player[] data) {
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i].name+ " age: "+data[i].age);
		}
	}
	
	
	
	
	
	void quickSortAge(player[] data) {
		if(data.length<2) {
			return;
		}
		int max=0;
		for(int i =1; i<data.length;i++) {
			if(data[max].age<data[i].age) {
				max=i;
			}
			swap(data, data.length-1, max);
			quickSortAge(data, 0, data.length-2);
				
		}
		
	}
	
	void quickSortAge(player[] data, int first, int last) {
		
		int lower = first+1, upper = last;
		swap(data, first, (first+last)/2);
		int bound = data[first].age;
		
		while(lower<=upper) {
			System.out.println("lower : "+lower+" upper : "+upper+" bound: "+bound);
			while(bound>=data[lower].age) {
				
				lower++;
			}
			while(bound<data[upper].age) {				
				upper--;
			}
			if(lower<upper) {
				swap(data, lower++, upper--);
			}
			else {
				lower++;
			}
		}
		swap(data,upper,first);
		if(first<upper-1) {
			quickSortAge(data,first,upper-1);
		}
		if(upper+1<last) {
			quickSortAge(data,upper+1,last);
		}
	}
}
