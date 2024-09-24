/**
	A simple binary tree class.
 */
 
public class BinaryTree
{
	// instance variable
	private BinaryTreeNode root;
	
	// Constructor
	public BinaryTree()
	{	root = null;
	}
	
	/** Inserts a given int value in the tree.
		@param num A new number to be inserted in the tree
		@throws IllegalArgumentException when inserting a duplicate number
	*/
	public void insert(int num) throws IllegalArgumentException		
	{	if (root == null)
			root = new BinaryTreeNode(num);
		else 
			root.insert(num);
	}		
	
} // end class