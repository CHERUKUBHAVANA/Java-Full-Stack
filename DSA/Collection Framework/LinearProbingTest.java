package CollectionPrograms;

public class LinearProbingTest {
	public static void main(String[] args) {
		LinearProbing<Integer,String> lp = new LinearProbing<>(5);
		System.out.println(lp.size());
		System.out.println(lp.isEmpty());
		lp.insert(10, "Bhavana");
		lp.insert(12,"Chandana");
		lp.insert(23, "Deekshitha");
		lp.insert(20, "Spandana");
		lp.delete(12);
		lp.insert(30, "Vikasini");
		lp.insert(35,"Rakesh");
		lp.delete(10);
		System.out.println(lp.size());
		System.out.println(lp.isEmpty());
		System.out.println(lp.search(12));
		System.out.println(lp.search(10));
		System.out.println(lp.search(23));
		System.out.println(lp.search(35));
		System.out.println(lp.search(30));
		System.out.println(lp.search(20));
		System.out.println(lp.get(23));
		System.out.println(lp.get(10));
		System.out.println(lp.get(30));
		System.out.println(lp.get(35));
	}
}
