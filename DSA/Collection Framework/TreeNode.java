package CollectionPrograms;

public class TreeNode<K extends Comparable<K>,V> {
	TreeNode<K,V> left;
	Pair<K,V> data;
	TreeNode<K,V> right;
	
	public TreeNode() {
		
	}
	
	public TreeNode(Pair<K,V> data) {
		this.data = data;
		left = null;
		right = null;
	}
	
	public String toString() {
		return data.toString();
	}
}
