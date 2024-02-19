package GenericsPrograms;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListStack<T> {
	ArrayList<T> stack;
	int top;
	public ArrayListStack() {
		stack = new ArrayList<>();
		top = -1;
	}
	public void push(T element) {
		stack.add(++top, element);
	}
	public T pop() {
		return stack.remove(top--);
	}
	public T peek() {
		return stack.get(top);
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
			data += " "+itr.next();
		return data;
	}
}
