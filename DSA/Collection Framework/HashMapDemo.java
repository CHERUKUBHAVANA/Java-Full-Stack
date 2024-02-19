package CollectionPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<>();
		HashMap<Integer,String> hm1 = new HashMap<>();
		hm.put(69, "Bhavana");
		hm.put(84, "Nandini");
		hm.put(82, "Bhavitha");
		hm.put(71, "Deekshitha");
		
		hm.putAll(hm1);
		System.out.println(hm.containsKey(86));
		System.out.println(hm.containsValue("Bhavana"));
		System.out.println(hm.get(84));
		System.out.println(hm.isEmpty());
		System.out.println(hm.remove(71));
		System.out.println(hm.replace(69, "Chandana"));
		System.out.println(hm.size());
		System.out.println(hm.entrySet());
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		
		Set keys = hm.entrySet();
		Iterator itr = keys.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> m = (Map.Entry)itr.next();
			System.out.println(m.getKey()+"----"+m.getValue());
		}
	}

}
