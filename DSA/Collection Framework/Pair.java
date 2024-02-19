package CollectionPrograms;

public class Pair<K extends Comparable<K>,V> {
	K key;
	V value;
	public Pair() {
		
	}
	public Pair(K key,V value) {
		this.key = key;
		this.value = value;
	}
	public String toString() {
		return key+" = "+value;
	}
}