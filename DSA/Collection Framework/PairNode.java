package CollectionPrograms;
public class PairNode<K extends Comparable<K>,V> {
	Pair<K,V> pair;
	PairNode<K,V> next;
	public PairNode() {
		
	}
	public PairNode(Pair<K,V> pair) {
		this.pair = pair;
		next = null;
	}
	public String toString() {
		return pair.toString();
	}
}