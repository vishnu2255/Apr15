package Test;

public class BinarySearchTreeNode {

	private int data;
    BinarySearchTreeNode left,right;
	
	public BinarySearchTreeNode(int data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public void setData(int data)
	{
		this.data = data;
	}
	
	public int getData()
	{
		return this.data;
	}
	
	public void setLeft(BinarySearchTreeNode left)
	{
		this.left = left;
	}
	
	public void setRight(BinarySearchTreeNode right)
	{
		this.right = right;
	}
	
	public BinarySearchTreeNode getRight()
	{
		return this.right;
	}
	
	public BinarySearchTreeNode getLeft()
	{
		return this.left;
	}	
}
