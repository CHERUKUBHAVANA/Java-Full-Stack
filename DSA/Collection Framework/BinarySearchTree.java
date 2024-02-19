package CollectionPrograms;

public class BinarySearchTree<K extends Comparable<K>,V> {
	int size;
	@SuppressWarnings("rawtypes")
	TreeNode root;
	
	public BinarySearchTree() {
		size = 0;
		root = null;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	@SuppressWarnings("unchecked")
	public void insert(K key,V value) {
		Pair<K,V> pair = new Pair<>(key,value);
		TreeNode<K,V> tn = new TreeNode<>(pair);
		TreeNode<K,V> temp = root;
		TreeNode<K,V> current = root;
		
		if(root == null) {
			root = tn;
			size++;
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
		if(key.compareTo(current.data.key) > 0)
			current.right = tn;
		else
			current.left = tn;
		size++;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public boolean remove(K key) {
		TreeNode<K,V> delNode = root;
		TreeNode<K,V> parent = root;
		if(root == null)
		return false;
		
		if(root.data.key.equals(key) && root.left==null && root.right==null) {
			root = null;
			size--;
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
			size--;
			return true;
		}
		
		//root deletion in case of skewed trees
		else if(delNode == root) {
			if(delNode.left==null && delNode.right!=null) {
				root = delNode.right;
				delNode.right = null;
				size--;
				return true;
			}
			if(delNode.left!=null && delNode.right==null) {
				root = delNode.left;
				delNode.left = null;
				size--;
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
				size--;
				return true;
		}
		
		//two-child node deletion
		if(delNode.right!=null && delNode.left!=null) {
			TreeNode temp = delNode.right;
			if(temp.right == null && temp.left == null) {
				delNode.data.key = (K) temp.data.key;
				delNode.data.value = (V) temp.data.value;
				delNode.right = null;
				size--;
				return true;
			}
			if(temp.right!=null && temp.left==null) {
				delNode.data.key = (K) temp.data.key;
				delNode.data.value = (V) temp.data.value;
				delNode.right = temp.right;
				temp.right = null;
				size--;
				return true;
			}
			inorderSucessor(delNode,temp);
			size--;
			return true;
		}
		return false;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void inorderSucessor(TreeNode delNode,TreeNode temp) {
		TreeNode parent = delNode;
		while(temp.left!=null) {
			parent = temp;
			temp = temp.left;
		}
		delNode.data.key = temp.data.key;
		delNode.data.value = temp.data.value;
		parent.left = null;
		return;
	}
	
	@SuppressWarnings("rawtypes")
	public void inorderTraversal(TreeNode root) {
		if(root == null)
			return;
		inorderTraversal(root.left);
		System.out.println(root.data);
		inorderTraversal(root.right);
	}
	
	public void inorder() {
		inorderTraversal(root);
	}
	
	@SuppressWarnings("rawtypes")
	public void preorderTraversal(TreeNode node) {
		if(node == null)
			return;
		System.out.println(node.data);
		preorderTraversal(node.left);
		preorderTraversal(node.right);
	}
	
	public void preorder() {
		preorderTraversal(root);
	}
	
	@SuppressWarnings("rawtypes")
	public void postorderTraversal(TreeNode root) {
		if(root == null)
			return;
		postorderTraversal(root.left);
		postorderTraversal(root.right);
		System.out.println(root.data);
	}
	
	public void postorder() {
		postorderTraversal(root);
	}
	
	@SuppressWarnings("unchecked")
	public  boolean search(K key) {
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
	
	@SuppressWarnings("unchecked")
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
}
