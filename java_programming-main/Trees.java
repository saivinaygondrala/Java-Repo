import java.util.*;
 class Node{
	Node left,right;
	int data;
	public Node(int data){
		this.data=data;
this.left=null;
this.right=null;
	}
	
}

public class Trees {
	static boolean flag=false;
	public static void DFS(Node root){
		// T.C :  O(N) 
		// S.C: O(N)
		System.out.println("Depth first search of tree is");
		Stack<Node> stk=new Stack<>();
		stk.push(root);
		while(!stk.isEmpty()){
			Node popped=stk.pop();
			if(popped!=null){
				System.out.println(popped.data+" ");
				if(popped.right!=null){
					stk.push(popped.right);
				}
			if(popped.left!=null){
				stk.push(popped.left);
			}
		}
	}
	}
	public static void search(int ele,Node node){
		if(node==null){
			return;
		}
		if(node.data==ele){ flag=true;
		return;
		}
		
		search(ele,node.left);
		search(ele,node.right);
	}
	static int max=Integer.MIN_VALUE;
	public static void getMaxPath(int sum,Node node){
		if(node==null){
			return;
		}
		sum+=node.data;
		if(sum>max) max=sum;
		if(node.left!=null)  getMaxPath(sum, node.left);
		if(node.right!=null)  getMaxPath(sum, node.right);

		
	}
	public static void DFS_rec(Node root){
		// T.C :  O(N) 
		// S.C: O(1) Theoritically but it internally uses stack so O(N)
		if(root==null) return;
		System.out.print(root.data+" ");
		DFS_rec(root.left);
		DFS_rec(root.right);
	}

	public static void BFS(Node root){
		// T.C :  O(N) 
		// S.C: O(N)
		Queue<Node> queue=new LinkedList<>();
		queue.add(root);
		System.out.println("BFS  of tree is");
		if(root==null) return;
		while(!queue.isEmpty()){
			Node removed=queue.remove();
			if(removed!=null){
				System.out.print(removed.data+" ");
				queue.add(removed.left);
				queue.add(removed.right);
			} 
		}

	}
	public static boolean searchRec(int ele,Node node){
		if(node==null) return false;
		if(node.data==ele) return true;
		return searchRec(ele, node.left) || searchRec(ele, node.right);
	}
	public static void main(String[] args)
	{
		// Node root=null;
		Node root=new Node(1);
		root.left=new Node(3);
		root.right=new Node(7);
		root.left.left=new Node(8);
		root.left.right=new Node(9);
		root.right.left=new Node(6);
		root.right.left.right=new Node(3);
		root.right.left.right.right=new Node(1);
		root.left.left.right=new Node(6);
		root.left.left.right.right=new Node(4);
		root.left.right.right=new Node(12);
		root.left.right.right.right=new Node(1);
		DFS(root);
		System.out.println("Depth first search of tree is");
		DFS_rec(root);
		System.out.println();
		BFS(root);
		int ch=9;
		
		System.out.println("The "+ch+" is present in tree: "+searchRec(ch, root));
		getMaxPath(0, root);
		System.out.println(max);
	}
}