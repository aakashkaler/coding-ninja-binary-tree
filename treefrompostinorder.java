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

	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder)
    {
	     return buildTree(postOrder,inOrder,0,postOrder.length-1,0,inOrder.length-1);
	}
    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder,int ps,int pe,int ins,int ine)
    {
        if(ins>ine)
        {
            return null;
        }
        int rootv=postOrder[pe];
        int k=0;
        BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootv);     
        for(int i=ins;i<=ine;i++)
        {
            if(inOrder[i]==rootv)
            {
                k=i;
                break;
            }
        }
        int lftins=ins;
        int lftine=k-1;
        int lftps=ps;
        int lftpe=(lftine-lftins)+lftps;
        
        int rghtins=k+1;
        int rghtine=ine;
        int rghtps=lftpe+1;
        int rghtpe=pe-1;
        root.left=buildTree(postOrder,inOrder,lftps,lftpe,lftins,lftine);
        root.right=buildTree(postOrder,inOrder,rghtps,rghtpe,rghtins,rghtine);
        
        return root;
	}
}
