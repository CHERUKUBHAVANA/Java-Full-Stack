package CollectionPrograms;

public class BSTTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree<Integer,String> bst = new BinarySearchTree<>();
		System.out.println(bst.size());
		System.out.println(bst.isEmpty());
		System.out.println(bst.search(10));
		bst.insert(60,"Bhavana");
		bst.insert(50, "Chandana");
		bst.insert(70, "Deekshitha");
		bst.insert(40, "Bhavitha");
		bst.insert(65, "Harika");
		bst.insert(75, "Nandini");
		bst.insert(30, "Nikhitha");
		bst.insert(45, "Divya");
		bst.insert(72, "Princy");
		//bst.remove(30);
		bst.remove(75);
		bst.remove(40);
		bst.remove(50);
		bst.remove(60);
		System.out.println(bst.size());
		System.out.println(bst.isEmpty());
		bst.inorder();
		System.out.println("-----------");
		bst.preorder();
		System.out.println("------------");
		bst.postorder();
		System.out.println(bst.search(40));
		System.out.println(bst.search(65));
		System.out.println(bst.search(30));
		System.out.println(bst.search(72));
		System.out.println(bst.search(75));
		System.out.println(bst.search(60));
		System.out.println(bst.get(72));
		System.out.println(bst.get(65));
		System.out.println(bst.get(75));
		System.out.println(bst.get(30));
	}

}
