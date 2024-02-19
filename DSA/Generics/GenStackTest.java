package GenericsPrograms;
import java.util.Scanner;
public class GenStackTest {
	public static void main(String[] args) {
		int choice;
		String cont;
		//Integer[] stack = new Integer[10];
		//ArrayListStack<Integer> st = new ArrayListStack<>();
		LinkedListStack<Integer> st = new LinkedListStack<>();
		System.out.println("1 : isEmpty");
		System.out.println("2 : size");
		System.out.println("3 : push");
		System.out.println("4 : pop");
		System.out.println("5 : peek");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
		switch(choice) {
			case 1:
				System.out.println("Empty : "+st.isEmpty());
				break;
			case 2:
				System.out.println("Size : "+st.size());
				break;
			case 3:
				int element;
				System.out.println("Enter element to be pushed : ");
				element = sc.nextInt();
				st.push(element);
				break;
			case 4 :
				if(st.isEmpty())
					System.out.println("Stack underflow");
				else
					System.out.println("Popped : "+st.pop());
				break;
			case 5:
				if(st.isEmpty())
					System.out.println("Stack underflow");
				else
					System.out.println("Peek element : "+st.peek());
				break;
			case 6 :
				if(st.isEmpty())
					System.out.println("Stack underflow");
				else
					System.out.println(st);
		}
		System.out.println("Want to continue : y/n");
		cont = sc.next();
		}while(cont.equalsIgnoreCase("y"));
	}
}
