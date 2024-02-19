package CollectionPrograms;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		TreeSet<Integer> ts1 = new TreeSet<>();
		ts.add(10);
		ts.add(8);
		ts.add(12);
		
		ts1.add(15);
		ts1.add(10);
		ts1.add(20);
		
		ts.addAll(ts1);
		
		System.out.println(ts.contains(18));
		System.out.println(ts.containsAll(ts1));
		System.out.println(ts.isEmpty());
		ts.remove(15);
		ts.removeAll(ts1);
		System.out.println(ts);
		ts.addAll(ts1);
		ts.retainAll(ts1);
		System.out.println(ts);
		System.out.println(ts.descendingSet());
		System.out.println(ts.size());
		System.out.println(ts.ceiling(13));
		System.out.println(ts.floor(13));
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.higher(20));
		System.out.println(ts.lower(20));
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		System.out.println(ts.headSet(8));
		System.out.println(ts.tailSet(15));
		System.out.println(ts.subSet(10, 18));
	}
}
