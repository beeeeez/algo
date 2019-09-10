package binarytree;

public class IntBST {

	
	protected IntBSTNode root;
	public IntBST() {
		root=null;
	}
	protected void visit(IntBSTNode p) {
		System.out.print(p.key + " ");
	}
	public void insert(int el) {
		IntBSTNode p = root;
		IntBSTNode prev=null;
		
		while(p!=null) {
			prev=p;
			if(p.key<el) {
				p=p.right;
			}
			else {
				p=p.left;
			}
		}
		
		if(root==null) {
			root=new IntBSTNode(el);
		}
		else if(prev.key<el) {
			prev.right=new IntBSTNode(el);
		}
		else {
			prev.left = new IntBSTNode(el);
		}
		
	}
	
	public IntBSTNode search(IntBSTNode p, int el) {
		while( p !=null) {
			if(el==p.key) {
				return p;
			}
			else if(el<p.key) {
				p=p.left;
			}
			else {
				p=p.right;
			}
		}
		return null;
	}
	
	public IntBSTNode recSearch(IntBSTNode p, int el) {

		 if(el<p.key) {
			return recSearch(p.left, el);
		}
		 else if(el>p.key) {
			 return recSearch(p.right,el);
		 }
		 
		 return p;
		
	}
	
	public static void main(String[] args) {
		
		IntBST myTree = new IntBST();
		
		myTree.insert(13);
		myTree.insert(10);
		myTree.insert(2);		
		myTree.insert(12);
		myTree.insert(25);
		myTree.insert(20);
		myTree.insert(31);
		myTree.insert(29);
		//myTree.bredthFirst();
	//	myTree.inOrder(myTree.root);
		//System.out.println(myTree.recSearch(myTree.root,12).key);
		System.out.println("InFix");
		myTree.inOrder(myTree.root);
		System.out.println("\nPreFix");
		myTree.preFixOrder(myTree.root);
		System.out.println("\nPostFix");
		myTree.postFixOrder(myTree.root);		
	}
	
	public void bredthFirst() {
		IntBSTNode p = root;
		Queue queue = new Queue();
		
		if( p != null ) {
			
			queue.enqueue(p);
			while(!queue.isEmpty()) {
				p=(IntBSTNode) queue.dequeue();
				visit(p);
				if(p.left!=null) {
					queue.enqueue(p.left);
				}
				if(p.right!=null) {
					queue.enqueue(p.right);
				}
			}
		}
	}
	
	protected void inOrder(IntBSTNode p ) {
		
		if(p!=null) {
			inOrder(p.left);
			visit(p);
			inOrder(p.right);
		}
	}
protected void postFixOrder(IntBSTNode p ) {
		
		if(p!=null) {			
			inOrder(p.left);
			inOrder(p.right);
			visit(p);
		}
	}

protected void preFixOrder(IntBSTNode p ) {
	
	if(p!=null) {			
		
		visit(p);
		inOrder(p.left);
		inOrder(p.right);
	}
}
	
}
