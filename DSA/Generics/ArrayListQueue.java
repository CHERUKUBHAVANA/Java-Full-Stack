package GenericsPrograms;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListQueue<T> {
	ArrayList<T> queue;
	public ArrayListQueue() {
		queue = new ArrayList<>();
	}
	public int size() {
		return queue.size();
	}
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	public void enqueue(T element) {
		queue.add(element);
	}
	public T dequeue() {
		return queue.remove(0);
	}
	public String toString() {
		String data = "";
		ListIterator<T> itr = queue.listIterator();
		while(itr.hasNext())
			data += " " + itr.next();
		return data;
	}
}
