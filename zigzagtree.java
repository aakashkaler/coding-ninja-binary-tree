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

	public static void printZigZag(BinaryTreeNode<Integer> root){

		
        Queue<BinaryTreeNode<Integer>> q=new LinkedList<>();
        Queue<BinaryTreeNode<Integer>> q1=new LinkedList<>();
        
     
        q.add(root);
        q.add(null);
        q1.add(root);
        q1.add(null);
        int a=1;
        while(!q.isEmpty())
        {
            BinaryTreeNode<Integer> t=q.remove();
            BinaryTreeNode<Integer> k=q1.remove();
            
            if(t==null)
            {
                System.out.println();
                if(q.isEmpty())
                {
                    break;
                }
                q1.add(null);
                q.add(null);
                a++;
            }
            else
            {
            if(t.left!=null)
            {
                q.add(t.left);
            }
            if(t.right!=null)
            {
                q.add(t.right);
            }
           if(k.right!=null)
            {
                q1.add(k.right);
            }
          if(k.left!=null)
            {
                q1.add(k.left);
            }
            if(a%2!=0)
            {
               System.out.print(t.data+" "); 
            }
            else
            {
              System.out.print(k.data+" ");  
        
                
            }
            }    
            
            
            
        }
        
        
	}

}
