package com.ds.tree;


public class BinarySearchTree {
	TreeNode root;
	
	public void insert(int data) {
		root = insertRecord(root,data);
	}

	public TreeNode insertRecord(TreeNode root, int data) {
		
		if(root == null) {
			root = new TreeNode(data);
		}else if(root.data>data){
			root.leftNode = insertRecord(root.leftNode, data);
		}else {
			root.rightNode = insertRecord(root.rightNode, data);
		}
		return root;		
	}
	
	public void inorder() {
		inorderRecord(root);
	}
	
	public void inorderRecord(TreeNode root) {
		if(root !=null) {
			inorderRecord(root.leftNode);
			System.out.println(root
					.data + " ");
			inorderRecord(root.rightNode);
		}
	}
	
	public void delete(int data) {
		root = deleteRecord(root,data);
	}
	
	
	
	private TreeNode deleteRecord(TreeNode root, int data) {
		if(root == null) {
			return root;
		}
		if(data < root.data) {
			root.leftNode = deleteRecord(root.leftNode, data);
		}else if(data > root.data) {
			root.rightNode = deleteRecord(root.rightNode, data);
		}else {
			if(root.leftNode == null)
				return root.rightNode;
			else if(root.rightNode == null)
				return root.leftNode;
			
			root.data = minValue(root.rightNode);
			root.rightNode = deleteRecord(root.rightNode, root.data);
		}
		
		return root;
	}

	private int minValue(TreeNode root) {
		int value = root.data;
		while(root.leftNode != null) {
			value = root.leftNode.data;
			root = root.leftNode;
		}
		return value;
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(5);
		bst.insert(8);
		bst.insert(9);
		bst.insert(3);
		bst.insert(12);
		bst.insert(1);
		bst.insert(15);
		System.out.println("Before Delete");
		bst.inorder();
		
		bst.delete(9);
		
		System.out.println("After Delete");
		
		bst.inorder();
		
		
	}

}

class TreeNode{
	int data;
	TreeNode leftNode;
	TreeNode rightNode;
	
	public TreeNode(int data) {
		this.data = data;
	}
}
