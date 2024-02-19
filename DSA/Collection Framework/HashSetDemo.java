package CollectionPrograms;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		HashSet<Integer> hs1 = new HashSet<>();
		
		hs.add(10);
		hs.add(20);
		hs.add(12);
		hs.add(8);
		
		hs1.add(12);
		hs1.add(18);
		hs1.add(60);
		hs1.add(21);
		
		hs.addAll(hs1);
		System.out.println(hs.contains(20));
		System.out.println(hs.containsAll(hs1));
		System.out.println(hs.isEmpty());
		System.out.println(hs.remove(18));
		hs.removeAll(hs1);
		System.out.println(hs);
		hs.addAll(hs1);
		hs.retainAll(hs1);
		System.out.println(hs);
		System.out.println(hs1);
		System.out.println(hs.size());
		
		Iterator<Integer> itr = hs.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
	}
}
