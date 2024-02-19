package CollectionPrograms;

public class SortedList<K extends Comparable<K>,V> {
	PairNode<K,V> head;
	int size;
	public SortedList() {
		size = 0;
		head = null;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	public int size() {
		return size;
	}
	public void insert(K key,V value) {
		Pair<K,V> pair = new Pair<>(key,value);
		PairNode<K,V> pn = new PairNode<>(pair);
		if(head == null) {
			head = pn;
			size++;
			return;
		}
			PairNode<K,V> current = head;
			PairNode<K,V> previous = head;
			
			while(current!=null) {
				if(key.compareTo(current.pair.key)>0) {
					previous = current;
					current = current.next;
				}
				else if(key.compareTo(current.pair.key) == 0) {
					System.out.println("\nDuplicates can't be inserted");
					return;
				}
				else {
					if(key.compareTo(head.pair.key) < 0) {
						head = pn;
						head.next = current;
						size++;
						return;
					}
//					while(key.compareTo(current.pair.key)>0) {
//						previous = current;
//						current = current.next;
//					}
					previous.next = pn;
					pn.next = current;
					size++;
					return;
				}
			}
			previous.next = pn;
			size++;
	}
	public void remove(K key) {
		if(head == null) {
			System.out.println("No elements in the dictionary");
			return;
		}
		PairNode<K,V> current = head;
		PairNode<K,V> previous = null;
		while(current!=null && current.pair.key.compareTo(key)!=0) {
			previous = current;
			current = current.next;
		}
		if(current == null) {
			System.out.println("Key not found");
			return;
		}
		PairNode<K,V> after = current.next;
		previous.next = after;
		System.out.println("Deleted entry : "+current.pair.key+" = "+current.pair.value);
		current.next = null;
		size--;
	}
	public String display() {
		String data = " ";
		PairNode<K,V> temp = head;
		while(temp!=null) {
			data += " "+temp.toString()+"\n";
			temp = temp.next;
		}
		return data;
	}
	public void search(K key) {
		PairNode<K,V> temp = head;
		while(temp!=null) {
			if(temp.pair.key.compareTo(key)==0) {
				System.out.println("Key found");
				return;
			}
			temp = temp.next;
		}
			System.out.println("Key not found");
	}
}
