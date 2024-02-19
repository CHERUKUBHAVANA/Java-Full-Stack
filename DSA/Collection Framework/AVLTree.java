package CollectionPrograms;

public class AVLTree<K extends Comparable<K>,V> {
	TreeNode<K,V> root;
	
	public AVLTree() {
		root = null;
	}
	
	public void insert(K key,V value) {
		Pair<K,V> pair = new Pair<>(key,value);
		TreeNode<K,V> tn = new TreeNode<>(pair);
		TreeNode<K,V> temp = root;
		TreeNode<K,V> current = root;
		
		if(root == null) {
			root = tn;
			return;
		}
		while(temp!=null) {
			if(key.compareTo(temp.data.key) > 0) {
				current = temp;
				temp = temp.right;
			}
			else {
				current = temp;
				temp = temp.left;
			}
		}
		if(key.compareTo(current.data.key) > 0) {
			current.right = tn;
			computeBalanceFactor(root);
		}
		else {
			current.left = tn;
			computeBalanceFactor(root);
		}
	}
	
	public void computeBalanceFactor(TreeNode<K,V> node) {
		if(node == null)
			return;
		computeBalanceFactor(node.left);
		computeBalanceFactor(node.right);
		int rDepth = rightDepth(node.right);
		int lDepth = leftDepth(node.left);
		if(Math.abs(rDepth-lDepth) > 1) {
			TreeNode<K,V> temp = root;
			TreeNode<K,V> current = root;
			if(node.data.key.equals(root.data.key))
				current = root;
			else {
				while(temp!=null && !node.data.key.equals(temp.data.key)) {
					if(node.data.key.compareTo(temp.data.key) > 0) {
						current = temp;
						temp = temp.right;
					}
					else {
						current = temp;
						temp = temp.left;
					}
				}
			}
			if(insertionType(node) == -1)
				balanceLL(node,current);
			else if(insertionType(node) == 1)
				balanceRR(node,current);
			else if(insertionType(node) == -2)
				balanceLR(node,current);
			else
				balanceRL(node,current);
		}
	}
	
	public int leftDepth(TreeNode<K,V> node) {
		if(node==null)
			return 0;
		int lDepth = leftDepth(node.left);
		int rDepth = leftDepth(node.right);
		if(rDepth > lDepth)
			return rDepth+1;
		return lDepth+1;
	}
	
	public int rightDepth(TreeNode<K,V> node) {
		if(node==null)
			return 0;
		int lDepth = rightDepth(node.left);
		int rDepth = rightDepth(node.right);
		if(rDepth > lDepth)
			return rDepth+1;
		return lDepth+1;
	}
	
	public int insertionType(TreeNode<K,V> node) {
		if(node.left!=null && node.left.right==null && node.left.left!=null)
			return -1;
		if(node.left==null && node.right!=null && node.right.left==null && node.right.right!=null)
			return 1;
		if( node.left!=null && node.left.right!=null )
			return -2;
		return 2;
	}
	public void balanceLL(TreeNode<K,V> node,TreeNode<K,V> current) {
			if(node.left.left.right!=null) {
				TreeNode<K,V> del = node.left.left.right;
				node.left.left.right = null;
				balanceLL(node,current);
				insert(del.data.key,del.data.value);
				return;
			}
			TreeNode<K,V> temp = node.left;
			temp.right = node;
			node.left = null;
			if(root==node) 
				root = temp;
			else if(node == current.left)
				current.left = temp;
			else
				current.right = temp;
	}
	
	public void balanceRR(TreeNode<K,V> node,TreeNode<K,V> current) {
			if(node.right.left!=null) {
				TreeNode<K,V> del = node.right.left;
				node.right.left = null;
				node.right.left = node;
				root = node.right;
				node.right = null;
				insert(del.data.key,del.data.value);
				return;
			}
			TreeNode<K,V> temp = node.right;
			temp.left = node;
			node.right = null;
			if(root == node) 
				root = temp;
			else if(node == current.left)
				current.left = temp;
			else
				current.right = temp;
	}
	
	public void balanceLR(TreeNode<K,V> node,TreeNode<K,V> current) {
		if(node.left.right.left!=null) {
			TreeNode<K,V> del = node.left.right.left;
			node.left.right.left = null;
			balanceLR(node,current);
			insert(del.data.key,del.data.value);
			return;
		}
		
		TreeNode<K,V> temp = node.left;
		node.left = temp.right;
		node.left.left = temp;
		temp.right = null;
		balanceLL(node,current);
	}
	
	public void balanceRL(TreeNode<K,V> node,TreeNode<K,V> current) {
		if(node.right.left.right!=null) {
			TreeNode<K,V> del = node.right.left.right;
			node.right.left.right = null;
			balanceRL(node,current);
			insert(del.data.key,del.data.value);
			return;
		}
		TreeNode<K,V> temp = node.right;
		node.right = temp.left;
		node.right.right = temp;
		temp.left = null;
		balanceRR(node,current);
	}
	
	public void inorderTraversal(TreeNode<K,V> root) {
		if(root == null)
			return;
		inorderTraversal(root.left);
		System.out.println(root.data);
		inorderTraversal(root.right);
		
	}
	
	public void inorder() {
		inorderTraversal(root);
	}
	
	public void preorderTraversal(TreeNode<K,V> node) {
		if(node == null)
			return;
		System.out.println(node.data);
		preorderTraversal(node.left);
		preorderTraversal(node.right);
	}
	
	public void preorder() {
		preorderTraversal(root);
	}
	
	public void postorderTraversal(TreeNode<K,V> root) {
		if(root == null)
			return;
		postorderTraversal(root.left);
		postorderTraversal(root.right);
		System.out.println(root.data);
	}
	
	public void postorder() {
		postorderTraversal(root);
	}
	
	public boolean delete(K key) {
		TreeNode<K,V> delNode = root;
		TreeNode<K,V> parent = root;
		if(root == null)
		return false;
		
		if(root.data.key.equals(key) && root.left==null && root.right==null) {
			root = null;
			return true;
		}
		
		//finding node to be deleted
		while(delNode!=null && delNode.data.key.compareTo(key) != 0) {
			if(key.compareTo(delNode.data.key) > 0) {
				parent = delNode;
				delNode = delNode.right;
			}	
			else {
				parent = delNode;
				delNode = delNode.left;
			}
		}
		if(delNode == null)
			return false;
		
		// leaf node deletion
		if(delNode.left == null && delNode.right == null) {
			if(parent.left == delNode)
				parent.left = null;
			else
				parent.right = null;
			computeBalanceFactor(root);
			return true;
		}
		
		//root deletion in case of skewed trees
		else if(delNode == root) {
			if(delNode.left==null && delNode.right!=null) {
				root = delNode.right;
				delNode.right = null;
				computeBalanceFactor(root);
				return true;
			}
			if(delNode.left!=null && delNode.right==null) {
				root = delNode.left;
				delNode.left = null;
				computeBalanceFactor(root);
				return true;
			}
		}
		
		//single-child node deletion
		else if(delNode.left==null || delNode.right==null) {
				if(delNode.right==null && delNode==parent.left) {
					parent.left = delNode.left;
					delNode.left = null;
				}
				if(delNode.left==null && delNode==parent.left) {
					parent.left = delNode.right;
					delNode.right = null;
				}
				if(delNode.right==null && delNode==parent.right) {
					parent.right = delNode.left;
					delNode.left = null;
				}
				if(delNode.left==null && delNode==parent.right) {
					parent.right = delNode.left;
					delNode.right = null;
				}
				computeBalanceFactor(root);
				return true;
		}
		
		//two-child node deletion
		if(delNode.right!=null && delNode.left!=null) {
			TreeNode<K,V> temp = delNode.right;
			if(temp.right == null && temp.left == null) {
				delNode.data.key = (K) temp.data.key;
				delNode.data.value = (V) temp.data.value;
				delNode.right = null;
				computeBalanceFactor(root);
				return true;
			}
			if(temp.right!=null && temp.left==null) {
				delNode.data.key = (K) temp.data.key;
				delNode.data.value = (V) temp.data.value;
				delNode.right = temp.right;
				temp.right = null;
				computeBalanceFactor(root);
				return true;
			}
			inorderSucessor(delNode,temp);
			computeBalanceFactor(root);
			return true;
		}
		return false;
	}
	
	public void inorderSucessor(TreeNode<K,V> delNode,TreeNode<K,V> temp) {
		TreeNode<K,V> parent = delNode;
		while(temp.left!=null) {
			parent = temp;
			temp = temp.left;
		}
		delNode.data.key = temp.data.key;
		delNode.data.value = temp.data.value;
		parent.left = null;
		return;
	}
	
	public TreeNode<K,V> get(K key){
		TreeNode<K,V> temp = root;
		TreeNode<K,V> current = root;
		if(root == null)
			return null;
		if(root.data.key.equals(key))
			return root;
		while(temp!=null && temp.data.key.compareTo(key) != 0) {
			if(key.compareTo(temp.data.key) > 0) {
				current = temp;
				temp = temp.right;
			}
			else {
				current = temp;
				temp = temp.left;
			}
		}
		if(temp == null)
			return null;
		if(key.compareTo(current.data.key) > 0)
			return current.right;
		return current.left;
	}
	
	public boolean search(K key) {
		TreeNode<K,V> temp = root;
		if(root == null)
			return false;
		if(root.data.key.equals(key))
			return true;
		while(temp!=null && temp.data.key.compareTo(key) != 0) {
			if(key.compareTo(temp.data.key) > 0)
				temp = temp.right;
			else 
				temp = temp.left;
		}
		if(temp == null)
			return false;
		return true;
	}
}
