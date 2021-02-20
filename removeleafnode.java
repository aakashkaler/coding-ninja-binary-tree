/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

 */


import java.util.*;

public class Solution {

	public static BinaryTreeNode<Integer> removeAllLeaves(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return null;
        }
        else if(root.left==null&&root.right==null)
        {
            return null; 
        }
       
        root.left=removeAllLeaves(root.left);
        root.right=removeAllLeaves(root.right);
        
        return root;
   
            
        
	}



}
