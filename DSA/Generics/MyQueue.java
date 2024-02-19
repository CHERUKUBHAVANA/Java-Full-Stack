package GenericsPrograms;

public class MyQueue<T> {
	T queue[];
	int size;
	int front,rear,capacity;
	public MyQueue(T[] queue,int capacity) {
		this.queue = queue;
		this.capacity = capacity;
		size = 0;
		front = rear = -1;
	}
	public boolean enqueue(T element) {
		if(rear == capacity-1)
			return false;
		if(front==-1)
			front++;
		queue[++rear] = element;
		size++;
		return true;
	}
	public T dequeue() {
		if(front==-1 || front>rear)
			return null;
		if(front==rear) {
			T temp = queue[front];
			front = rear = -1;
			size--;
			return temp;
		}
		size--;
		return queue[front++];
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return front==-1;
	}
	public String toString() {
		String data = "";
		for(int i=front;i<=rear;i++)
			data += " "+queue[i];
		return data;
	}
}
