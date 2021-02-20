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

	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) 
    {
		return buildTree(preOrder,inOrder,0,inOrder.length-1,0,preOrder.length-1);
	}
    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder,int ins,int ine,int prs,int pre)
    {
	    if(ins>ine)
        {
            return null;
        }
        int rootv=preOrder[prs];
        BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootv);
        
        int n=0;
        for(int i=;i<=ine;i++)
        {
            if(inOrder[i]==preOrder[prs])
            {
                n=i;
                break;
            }
        }
        int lftins=ins;
        int lftinoe=n-1;
        int lftprs=prs+1;
        int lftpre=lftinoe-lftins+lftprs;
        
        int rghtins=n+1;
        int rghtinoe=ine;
        int rghtprs=lftpre+1;
        int rghtpre=pre;
        root.left=buildTree(preOrder,inOrder,lftins,lftinoe,lftprs,lftpre);
        root.right=buildTree(preOrder,inOrder,rghtins,rghtinoe,rghtprs,rghtpre);
        return root;
        
	}
    

}
