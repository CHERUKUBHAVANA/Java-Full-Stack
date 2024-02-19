package GenericsPrograms;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListQueue<T> {
	LinkedList<T> queue;
	public LinkedListQueue() {
		queue = new LinkedList<>();
	}
	public int size() {
		return queue.size();
	}
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	public void enqueue(T element) {
		queue.addLast(element);
	}
	public T dequeue() {
		return queue.removeFirst();
	}
	public String toString() {
		String data = "";
		ListIterator<T> itr = queue.listIterator();
		while(itr.hasNext())
			data += " " + itr.next();
		return data;
	}
}
