package Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class April17 {

	Node root;
	
	public void addNode(int key,String name)
	{
		Node tmp = new Node(key,name);
		
		if(root==null)
		{
			root=tmp;
		}
		else
		{
			Node focusNode= root;
			Node parent;			
			while(true)
			{			parent = focusNode;	
				if(key<focusNode.key)
				{
		          	focusNode = focusNode.leftchild;
		          	
		          	if(focusNode==null)
		          	{
		          		parent.leftchild = tmp;
		          		return;
		          	}
				}
				else if(key>focusNode.key)
				{
					focusNode = focusNode.rightchild;
					if(focusNode==null)
					{
						parent.rightchild = tmp;
						return;
					}
				}
			}
			
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

	}
	
	public static int sizeOfBT(BinaryTreeNode root)
	{
		if(root == null)
		{
			return 0;
		}
		int cnt=0;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.add(root);
		
		while(!q.isEmpty()) {
			BinaryTreeNode tmp = q.poll();
			cnt++;
			if(tmp.left!=null)
			{
//				cnt++;
				q.offer(tmp.left);
			}
			
			if(tmp.right!=null)
			{
//				cnt++;
				q.offer(tmp.right);
			}
		}
		
		return cnt;
	}
	public BinaryTreeNode insertInBT(BinaryTreeNode root,int data)
	{
		if(root == null)
		{
			return null;
		}
		
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.add(root);
		
		while(!q.isEmpty())
		{
			BinaryTreeNode tmp  = q.poll();
			
			if(tmp!=null)
			{
				if(tmp.left!=null)
				{
					q.offer(tmp.left);
				}
				else
				{
					tmp.left = new BinaryTreeNode(data);
					return root;
				}
				
				if(tmp.right!=null)
				{
					q.offer(tmp.right);
				}
				else
				{
					tmp.right = new BinaryTreeNode(data);
					return root;
				}
			}
			
			
		}
		return root;
	}
	
	public static boolean findInBT(BinaryTreeNode root,int data)
	{
		if(root == null)
		{
			return false;
		}
		
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.add(root);
		
		while(!q.isEmpty())
		{
			BinaryTreeNode tmp =q.poll();
			
			if(tmp.data== data)
			{
				return true;
			}
			
			if(tmp.left!=null)
			{
				q.add(tmp.left);
			}
			
			if(tmp.right!=null)
			{
				q.add(tmp.right);
			}
			
		}
		
		return false;
		
	}
	
	public int maxInBinaryTreeTraversal(BinaryTreeNode root)
	{
		if(root == null)
		{
			return Integer.MIN_VALUE;
		}
		
		int max = Integer.MIN_VALUE;
		
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.add(root);		
		
		while(!q.isEmpty())
		{
			BinaryTreeNode tmp = q.poll();
			
			if(tmp.data>max)
			{
				max = tmp.data;
			}
			
			if(tmp.left!=null)
			{
				q.offer(tmp.left);
			}
			
			if(tmp.right!=null)
			{
				q.offer(tmp.right);
			}
			
		}
		
		
		return max;
	}
	
	public ArrayList<Integer> levelOrderTraversal(BinaryTreeNode root)
	{
		ArrayList<Integer> res = new ArrayList<Integer>();
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		
		if(root == null)
		{
			return res;
		}
		
		q.add(root);
		
		while(!q.isEmpty())
		{
			root = q.poll();
			res.add(root.data);
			
			if(root.left!=null)
			{
				q.add(root.left);
			}
			
			if(root.right!=null)
			{
				q.add(root.right);
			}
			
		}
		
		return res;		
	}
	
	
	
	public ArrayList<Integer> preOrderTraversal(BinaryTreeNode root)
	{
		ArrayList<Integer> res= new ArrayList<Integer>();
		Stack<BinaryTreeNode> st = new Stack<BinaryTreeNode>();
		//validating if root is null no need to traverse
		if(root==null)
		{
			return res;
		}
		
		//else push the root to stack 
		
		st.push(root);
		
		//loop until stack is empty
		while(!st.isEmpty())
		{
			BinaryTreeNode node = st.pop();
			res.add(node.data);
			
			if(node.right!=null)
			{
				st.push(node.right);
			}
			
			if(node.left!=null)
			{
				st.push(node.left);
			}
		}
								
		return res;
		
	}
	
	public ArrayList<Integer> postOrder(BinaryTreeNode root)
	{
		
		ArrayList<Integer> ar = new ArrayList<Integer>();		
		BinaryTreeNode crnt = root;
		
		Stack<BinaryTreeNode> st = new Stack<BinaryTreeNode>();
		
//		st.add(crnt);
		while(crnt!=null || !st.isEmpty())
		{
			if(crnt!=null)
			{
				crnt=crnt.left;
				st.add(crnt);
			}
			else
			{
				BinaryTreeNode tmp = st.peek().right;
				
				if(tmp==null)
				{
					tmp=st.pop();
					ar.add(tmp.data);
					
					while(!st.isEmpty() && tmp == st.peek().right)
					{
						tmp = st.pop();
						ar.add(tmp.data);
					}
				}
				
				else
				{
					crnt = tmp;
				}
			}
			
		}
		
		return ar;
	}
	
	public ArrayList<Integer> inOrder(BinaryTreeNode root)
	{
		Stack<BinaryTreeNode> st = new Stack<BinaryTreeNode>();
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		boolean done=false;
		BinaryTreeNode crnt = root;
		while(!done)
		{
			if(crnt!=null)
			{
				st.push(crnt);
				crnt= crnt.left;
				
			}
			
			else
				
			{
				
				if(st.isEmpty())
				{
					done = true;
				}
				else
				{
					crnt = st.pop();
					ar.add(crnt.data);
					crnt=crnt.right;
				}
			}
			
		}
		
		return ar;
		
	}

}


class Node
{
int key;
String name;

Node leftchild,rightchild;

Node(int key,String name)
{
this.key = key;
this.name =name;
	
}

}