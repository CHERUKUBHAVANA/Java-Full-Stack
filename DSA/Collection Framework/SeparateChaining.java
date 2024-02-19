package CollectionPrograms;

class Node<K extends Comparable<K>,V>{
	K key;
	V value;
	Node<K,V> next;
	public Node(K key,V value) {
		this.key = key;
		this.value = value;
		next = null;
	}
}
class SeparateChaining<K extends Comparable<K>,V>{
	int size;
	int capacity;
	@SuppressWarnings("rawtypes")
	Node[] table;
	public SeparateChaining() {
		
	}
	public SeparateChaining(int capacity) {
		size = 0;
		this.capacity = capacity;
		table = new Node[capacity];
	}
	
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	@SuppressWarnings("unchecked")
	public void insert(K key,V value){
		Node<K,V> newNode = new Node<>(key,value);
		int index = (Integer)key % capacity;
		
		if(table[index] == null) {
			table[index] = newNode;
		}
		else {
			Node<K,V> temp = table[index];
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		size++;
	}
	
	@SuppressWarnings("unchecked")
	public boolean remove(K key) {
		int index = (Integer)key % capacity;
		Node<K,V> temp = table[index];
		if(temp.key.equals(key)) {
			table[index] = temp.next;
			temp.next = null;
			size--;
			return true;
		}
		Node<K,V> previous = temp;
		while(temp!=null) {
			
			if(temp.key.equals(key)) {
				previous.next = temp.next;
				temp.next = null;
				size--;
				return true;
			}
			previous = temp;
			temp = temp.next;
		}
			return false;
	}
	
	@SuppressWarnings("unchecked")
	public  V get(K key) {
		int index = (Integer)key % capacity;
		Node<K,V> temp = table[index];
		
		while(temp!=null) {
			if(temp.key.equals(key))
				return temp.value;
			temp = temp.next;
		}
		return null;
	}
	public boolean search(K key) {
		int index = (Integer)key % capacity;
		@SuppressWarnings("unchecked")
		Node<K,V> temp = table[index];
		while(temp!=null) {
			if(temp.key.equals(key))
				return true;
			temp = temp.next;
		}
			return false;
	}
}
