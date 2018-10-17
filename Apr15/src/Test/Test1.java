package Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		System.out.println("testing app");
		BinaryTreeNode rootnode = new BinaryTreeNode(1);
		BinaryTreeNode leftnode = new BinaryTreeNode(2);
		BinaryTreeNode rytnode = new BinaryTreeNode(3);
		BinaryTreeNode n1 = new BinaryTreeNode(4);
		BinaryTreeNode n2 = new BinaryTreeNode(5);
		BinaryTreeNode n3 = new BinaryTreeNode(6);
		BinaryTreeNode n4 = new BinaryTreeNode(7);
		
		leftnode.setLeft(n1);
		leftnode.setRight(n2);
		
		rytnode.setLeft(n3);
		rytnode.setRight(n4);
		
		rootnode.setLeft(leftnode);
		rootnode.setRight(rytnode);
															
	}
	
	public static void preorderTraversal(BinaryTreeNode root)
	{
		ArrayList<Integer> res = new ArrayList<Integer>();
		Stack<BinaryTreeNode> st = new Stack<BinaryTreeNode>();
		
		st.push(root);
		
		while(!st.isEmpty())
		{
			BinaryTreeNode tmp = st.pop();
			//int ele = tmp.data;
			res.add(tmp.data);
			
			while(tmp.right!=null)
			{
				st.push(tmp.right);
			}
			
			while(tmp.left!=null)
			{
				st.push(tmp.right);
			}
			
		}
		
		for(int a : res)
		{
			System.out.println(a);
		}
	}
}
