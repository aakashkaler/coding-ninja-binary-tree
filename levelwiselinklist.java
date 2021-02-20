import java.util.*;

public class Solution {
	/*
	 * BinaryTreeNode class
	 * 
	 * class BinaryTreeNode<T> 
	 * { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 *		public BinaryTreeNode(T data) 
	 *		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
	/*
	 * LinkedListNode Class
	 * class LinkedListNode<T> 
	 * { 
	 * 		T data; 
	 * 		LinkedListNode<T> next;
	 * 		public LinkedListNode(T data) 	
	 * 		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
	public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
		// Write your code here
        Queue<BinaryTreeNode<Integer>> q=new LinkedList<>();
        ArrayList<LinkedListNode<Integer>> output=new ArrayList<>();
        LinkedListNode<Integer> head=null;
        LinkedListNode<Integer> tail=null;
        q.add(root);
        q.add(null);
        if(root==null)
        {
            return output;
        }
        while(!q.isEmpty())
        {
           BinaryTreeNode<Integer> current=q.remove();
           if(current==null)
           {
               output.add(head);
               head=null;
               tail=null;
               if(q.isEmpty())
               {
                   break;
               }
               q.add(null);
               
           }
            else
            {
                LinkedListNode<Integer> node=new LinkedListNode<>(current.data);
                if(head==null)
                {
                    head=node;
                    tail=node;
                }
                else
                {
                    tail.next=node;
                    tail=tail.next;
                }
                if(current.left!=null)
                {
                    q.add(current.left);
                }
                if(current.right!=null)
                {
                    q.add(current.right);
                }
            }
        }
        return output;
	}

}
