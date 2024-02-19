package GenericsPrograms;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStack<T> {
	LinkedList<T> stack;
	public LinkedListStack() {
		stack = new LinkedList<>();
	}
	public void push(T element) {
		stack.addLast(element);
	}
	public T pop() {
		return stack.removeLast();
	}
	public T peek() {
		return stack.getLast();
	}
	public int size() {
		return stack.size();
	}
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	public String toString() {
		String data = "";
		ListIterator<T> itr = stack.listIterator();
		while(itr.hasNext()) 
			itr.next();
		while(itr.hasPrevious())
			data += " " + itr.previous();
		return data;
	}
}
