package GenericsPrograms;

public class MyStack1<T> {
	Node<T> top;
	int size;
	public MyStack1() {
		top = null;
		size = 0;
	}
	public void push(T element) {
		Node<T> n = new Node<>();
		n.data = element;
		if(top == null) {
			top = n;
			size++;
			return;
		}
		n.next = top;
		top = n;
		size++;
	}
	public T pop() {
		if(top == null)
			return null;
		Node<T> temp = top;
		top = top.next;
		temp.next = null;
		size--;
		return temp.data;
	}
	public T peek() {
		return  (T) top.data;
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return top == null;
	}
	public String toString() {
		String data = "";
		Node<T> temp = top;
		while(temp!=null) {
			data += " "+temp.data;
			temp = temp.next;
		}
		return data;
	}
}
