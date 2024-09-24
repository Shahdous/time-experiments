
public class BinaryTreeNode {

	private int num;
	private BinaryTreeNode left;
	private BinaryTreeNode right;

	public BinaryTreeNode(int num){	
		this.num = num;
		left = null;
		right = null;
	}

	private void setNum(int num){	
		this.num = num;
	} 

	public int getNum(){	
		return num;
	} 

	public BinaryTreeNode getLeft(){
		return left;
	} 

	public BinaryTreeNode getRight(){
		return right;
	}

	public void insert(int newNumber){
	
		if (newNumber == num){
			throw new IllegalArgumentException("Duplicate found: Number " + newNumber + 
										" is already in the tree.");
			
		} else if (newNumber < this.num){	
			if (left == null)
				left = new BinaryTreeNode(newNumber);
			else
				left.insert(newNumber);
		
		} else {	

			if (right == null)
				right = new BinaryTreeNode(newNumber);
			else
				right.insert(newNumber);
		}	
	}	
}

