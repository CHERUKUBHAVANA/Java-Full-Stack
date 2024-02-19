package CollectionPrograms;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
		LinkedHashSet<Integer> hs1 = new LinkedHashSet<>();
		
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
