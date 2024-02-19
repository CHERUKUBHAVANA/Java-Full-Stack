package CollectionPrograms;

public class SeparateChainingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeparateChaining<Integer,String> sc = new SeparateChaining<>(10);
		System.out.println(sc.isEmpty());
		System.out.println(sc.size());
		System.out.println(sc.search(18));
		sc.insert(69,"Bhavana");
		sc.insert(89, "Nikhitha");
		System.out.println((Object)sc.get(89));
		sc.remove(69);
		sc.insert(76, "Priya");
		sc.insert(71, "Deekshitha");
		sc.insert(66,"Anvitha");
		sc.insert(81, "Harika");
		sc.insert(86, "Princy");
		System.out.println(sc.search(81));
		System.out.println((Object)sc.get(81));
		System.out.println((Object)sc.get(69));
		System.out.println((Object)sc.get(89));
		sc.remove(81);
		sc.remove(76);
		System.out.println(sc.isEmpty());
		System.out.println(sc.size());
		System.out.println(sc.search(69));
		System.out.println(sc.search(89));
	}

}
