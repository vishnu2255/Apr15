package Test;

public class April25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean isBST(BinarySearchTreeNode root)
	{
		if(root==null)
		{
			return true;
		}
		 if(root.getLeft()!=null && (findMax(root.getLeft()).getData()) < (root.getData()))
		{
			return true;
		}
		
		 if(root.getRight()!=null && findMin(root.getRight()).getData()<root.getData())
		{
			return true;
		}
		
		 if(isBST(root.getLeft()) && isBST(root.getRight()))
		 {
			 return true;
		 }
		
		return false;
		
	}
	
	public static BinarySearchTreeNode deleteNode(BinarySearchTreeNode root,int data)
	{
		if(root == null)
		{
			return null;
		}
		
		else
		{
			if(data<root.getData())
			{
//				root=root.getLeft();
				root.left = deleteNode(root,data);
				
			}
			else if(data>root.getData())
			{				
				root.right = deleteNode(root, data);
			}
			else
			{
				if(root.getLeft()!=null && root.getRight()!=null)
				{
					BinarySearchTreeNode tmp= null;
					tmp = findMax(root.getLeft());
					root.setData(tmp.getData());
					root.setLeft(deleteNode(root.getLeft(),root.getData()));
				}
				else
				{
					BinarySearchTreeNode tmp= null;
					tmp = root.getLeft()==null?root.getRight():root.getLeft();
					
					if(tmp==null)
					{
						return null;
					}
					else
					{
						return tmp;
					}
					
				}
				
			}
		}
		
		return null;
	}
	
	public static BinarySearchTreeNode insertNode(BinarySearchTreeNode root,int data)
	{
		BinarySearchTreeNode parent = root;
		
		if(root==null)
		{
			root = new BinarySearchTreeNode(data);
			return root;
		}
		
		else
		{
			while(true)
			{
			
			if(data<parent.getData())
			{
//				parent = parent.getLeft();
				if(parent.getLeft()!=null)
				{
					parent=parent.getLeft();
				}
				else
				{
					BinarySearchTreeNode tmp = new BinarySearchTreeNode(data);
					parent.setLeft(tmp);
					return root;
				}
				
			}
			else
			{
				
				if(parent.getRight()!=null)
				{
					parent=parent.getRight();
				}
				else
				{
					BinarySearchTreeNode tmp = new BinarySearchTreeNode(data);
					parent.setRight(tmp);
					return root;
				}
				
			}
			
			
			
			}
		}

		
		
		
	}
	
	public static BinarySearchTreeNode findMin(BinarySearchTreeNode root)
	{
		if(root==null)
		{
			return null;
		}
		
		while(root.getLeft()!=null)
		{
			root=root.getLeft();
		}
		
		return root;
	}
	
	public static BinarySearchTreeNode findMax(BinarySearchTreeNode root)
	{
		if(root==null)
		{
			return null;
		}
		
		while(root.getRight()!=null)
		{
			root=root.getRight();
		}
		
		return root;
	}
			
	public static BinarySearchTreeNode findInBST(BinarySearchTreeNode root,int data)
	{
		if(root == null)
		{
			return null;
		}
		
		while(root!=null)
		{
			if(root.getData() == data)
			{
				return root;
			}
			
			else if(data > root.getData())
			{
				root = root.getRight();
			}
			
			else
			{
				root = root.getLeft();
			}
			
		}
		
		return null;
	}

}
