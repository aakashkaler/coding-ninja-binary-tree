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

public class Solution {

	public static boolean checkBalanced(BinaryTreeNode<Integer> root) {

		if(root==null)
        {
            return true;
        }
        boolean ans=checkBalanced(root.right)&&checkBalanced(root.right);
        if(ans==false)
        {
            return false;
        }
        if((height(root.left)-height(root.right))>1)
        {
            return false;
        }
        if((root.right==null&&root.left!=null)||(root.right!=null&&root.left==null))
        {
            return false;
        }
        return ans;
	}
    public static int height(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root==null)
        {
            return 0;
        }
    
        int c=1;
        int d=1;
         c=c+height(root.left);
         d=d+height(root.right);
        if(c>d)
        {
            return c;
        }
        else
        {
            return d;
        }
        
	}


}
