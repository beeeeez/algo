package stack;

public class arrayStack {
	private int[] data;
	private int size;
	
	public arrayStack(int s) {
		data=new int[s];
		size=0;
	}
	public void clear() {
		data = new int[size()];
		size=0;
	}
	public int size() {
		System.out.println("size is : " +size);
		return size;
	}
	public void push(int e) {
		if(size+1>data.length) {
			System.out.println("doubling array size to "+data.length*2);
			int[] newData= new int[data.length*2];
			for(int i=0;i<data.length;i++) {
				newData[i]=data[i];
			}
			data=newData;
		}
		System.out.println(size);
		data[size]=e;
		size++;
	}
	public void pop() {
		data[size]=0;
		size--;
	}
	public void listAll() {
		for(int i=0;i<size;i++) {
			System.out.println(data[i]);
		}
	}
	public boolean find(int e) {
		for(int i=0;i<size;i++) {
			if(data[i]==e) {
				System.out.println("true");
				return true;
			}
		}
		System.out.println("false");
		return false;
	}
	public int indexOf(int e) {
		for(int i=0;i<size;i++) {
			if(data[i]==e) {
				System.out.println("index : "+i);
				return i;
			}
			
		}
		System.out.println("index not found");
		return -1;
	}
	
	
	
	
}
