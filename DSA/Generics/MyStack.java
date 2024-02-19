/* Generic Stack using user-defined arrays */
package GenericsPrograms;

public class MyStack<T> {
	T stack[];
	int top,capacity;
	public MyStack(T[] stack,int capacity) {
		this.stack = stack;
		this.capacity = capacity;
		top = -1;
	}
	public boolean push(T element) {
		if(capacity-1 == top)
			return false;
		stack[++top] = element;
		return true;
	}
	public T pop() {
		if(top == -1)
			return null;
		return stack[top--];
	}
	public T peek() {
		return stack[top];
	}
	public int size() {
		return top+1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public String toString() {
		String data = "";
		for(int i=0;i<=top;i++)
			data += " "+stack[i];
		return data;
	}
	
}
