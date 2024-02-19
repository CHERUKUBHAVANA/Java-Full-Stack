package CollectionPrograms;

class KeyValue<K extends Comparable<K>,V>{
	K key;
	V value;
	public KeyValue() {
		
	}
	public KeyValue(K key,V value) {
		this.key = key;
		this.value = value;
	}
	public String toString() {
		return key + " = " + value;
	}
}
class LinearProbing<K extends Comparable<K>,V>{
	int capacity;
	int size;
	@SuppressWarnings("rawtypes")
	KeyValue[] list;
	public LinearProbing() {
		
	}
	
	public LinearProbing(int capacity) {
		this.capacity = capacity;
		list = new KeyValue[capacity];
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public boolean insert(K key,V value) {
		KeyValue<K,V> kv = new KeyValue<>(key,value);
		int index = (Integer)key % capacity;
		if(list[index] == null) {
			list[index] = kv;
			size++;
			return true;
		}
		int newIndex;
		if((newIndex = probe(key,index)) != -1) {
			list[newIndex] = kv;
			size++;
			return true;
		}
		return false;
	}
	
	public  int probe(K key,int index) {
		int count = 0;
		while(list[index] != null) {
			index = (index+1) % capacity;
			count++;
			if(count == capacity)
				break;
		}
		if(count<capacity)
			return index;
		return -1;
	}
	
	@SuppressWarnings("unchecked")
	public  KeyValue<K,V> delete(K key) {
		int index = (Integer)key % capacity;
		int count = 0;
		if(list[index].key.equals(key)) {
			list[index] = null;
			size--;
			return list[index];
		}
		while(count != capacity) {
			if(list[index] != null) {
				if(list[index].key.equals(key)) {
					list[index] = null;
					size--;
					return list[index];
				}
			}
			index = (index+1) % capacity;
			count++;
		}
		return null;
	}
	public  int search(K key) {
		int index = (Integer)key % capacity;
		int count = 0;
		if(list[index] != null && list[index].key.equals(key))
			return index;
		while(count != capacity) {
			if(list[index] != null) {
				if(list[index].key.equals(key))
					return index;
			}
			index = (index+1) % capacity;
			count++;
		}
		return -1;
	}
	
	@SuppressWarnings("unchecked")
	public  KeyValue<K,V> get(K key) {
		int index = (Integer)key % capacity;
		int count = 0;
		if(list[index] != null && list[index].key.equals(key))
			return list[index];
		while(count != capacity) {
			if(list[index] != null) {
				if(list[index].key.equals(key))
					return list[index];
			}
			index = (index+1) % capacity;
			count++;
		}
		return null;
	}
}
