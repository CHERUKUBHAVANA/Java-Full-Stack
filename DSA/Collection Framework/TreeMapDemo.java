package CollectionPrograms;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<>();
		TreeMap<Integer,String> tm1 = new TreeMap<>();
		tm.put(69, "Bhavana");
		tm.put(63, "Aishwarya");
		tm.put(84, "Nandini");
		tm.put(82, "Bhavitha");
		
		tm1.put(87, "Nikhitha");
		tm1.put(86, "Neha");
		
		tm.putAll(tm1);
		
		System.out.println(tm.containsKey(18));
		System.out.println(tm.containsValue("Princy"));
		System.out.println(tm.isEmpty());
		tm.remove(15);
		System.out.println(tm);
		tm.putAll(tm1);
		System.out.println(tm);
		System.out.println(tm.replace(69, "Chandana"));
		System.out.println(tm.size());
		System.out.println(tm.entrySet());
		System.out.println(tm.keySet());
		System.out.println(tm.values());
		System.out.println(tm.descendingKeySet());
		System.out.println(tm.size());
		System.out.println(tm.ceilingEntry(13));
		System.out.println(tm.floorEntry(13));
		System.out.println(tm.floorKey(13));
		System.out.println(tm.firstEntry());
		System.out.println(tm.firstKey());
		System.out.println(tm.lastEntry());
		System.out.println(tm.lastKey());
		System.out.println(tm.higherEntry(20));
		System.out.println(tm.higherKey(20));
		System.out.println(tm.lowerEntry(20));
		System.out.println(tm.lowerKey(20));
		System.out.println(tm.pollFirstEntry());
		System.out.println(tm.pollLastEntry());
		System.out.println(tm.headMap(8));
		System.out.println(tm.tailMap(15));
		System.out.println(tm.subMap(10, 18));
		
	}
}
