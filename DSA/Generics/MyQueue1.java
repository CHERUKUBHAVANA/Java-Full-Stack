package GenericsPrograms;

public class MyQueue1<T> {
	int size;
	Node<T> front,rear;
	public MyQueue1() {
		size = 0;
		front = rear = null;
	}
	public void enqueue(T element) {
		Node<T> n = new Node<>();
		n.data = element;
		if(front == null) {
			front = rear = n;
			size++;
			return;
		}
		rear.next = n;
		rear = n;
		size++;
	}
	public T dequeue() {
		if(front==null)
			return null;
		Node<T> temp = front;
		if(front==rear) {
			front = rear = null;
			size--;
			return temp.data;
		}
		front = front.next;
		size--;
		return temp.data;
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return front==null;
	}
	public String toString() {
		String data = "";
		Node<T> temp = front;
		while(temp!=null) {
			data += " "+temp.data;
			temp = temp.next;
		}
		return data;
	}
}
