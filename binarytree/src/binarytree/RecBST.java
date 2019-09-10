package binarytree;

public class RecBST {
	protected IntBSTNode root;
	public RecBST() {
		root=null;
	}
	protected void visit(IntBSTNode p) {
		System.out.print(p.key + " ");
	}
	
}
