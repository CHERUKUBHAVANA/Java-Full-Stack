package CollectionPrograms;

public class AVLTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AVLTree<Integer,String> avl = new AVLTree<>();
		avl.insert(40, "Bhavitha");
		avl.insert(20, "Harika");
		avl.insert(10, "Nandini");
		avl.insert(25, "Nikhitha");
//		avl.delete(50);
		avl.insert(30, "Bhavana");
		System.out.println(avl.get(20));
		System.out.println(avl.get(42));
		System.out.println(avl.search(22));
		avl.insert(22, "Deekshitha");
		avl.insert(50, "Deeks");
//		avl.insert(46, "Deeks");
//		avl.insert(11, "Deeks");
//		avl.insert(48, "Deeks");
		//avl.delete(25);
		System.out.println(avl.search(22));
		avl.inorder();
		System.out.println("-----------");
		avl.preorder();
		System.out.println("------------");
		avl.postorder();
	}

}

