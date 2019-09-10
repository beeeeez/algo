package treeThing;

public class node {
	
	int val;
	node jimmy, jammy;
	
	public node() {
		jimmy=jammy=null;
	}
	
	public node(int val) {
		this(val, null, null,);
	}
	
	public node(int val,node jimmy, node jammy ) {
		this.jimmy=jimmy;
		this.jammy=jammy;
		this.val=val;
	}
	
	

}


