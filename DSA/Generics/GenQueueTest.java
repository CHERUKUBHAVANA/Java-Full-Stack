package GenericsPrograms;

import java.util.Scanner;

public class GenQueueTest {
	public static void main(String[] args) {
		int choice;
		String cont;
		//Integer queue[] = new Integer[10];
		//MyQueue1<Integer> q = new MyQueue1<>();
		//ArrayListQueue<Integer> q = new ArrayListQueue<>();
		LinkedListQueue<Integer> q = new LinkedListQueue<>();
		System.out.println("1 : isEmpty");
		System.out.println("2 : size");
		System.out.println("3 : Enqueue");
		System.out.println("4 : Dequeue");
		System.out.println("5 : Display");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Empty : "+q.isEmpty());
			break;
		case 2:
			System.out.println("Size : "+q.size());
			break;
		case 3:
			int element;
			System.out.println("Enter element to be enqueued: ");
			element = sc.nextInt();
			q.enqueue(element);
			break;
		case 4 :
			if(q.isEmpty())
				System.out.println("Queue is empty");
			else
				System.out.println("Dequeue : "+q.dequeue());
			break;
		case 5 :
			if(q.isEmpty())
				System.out.println("Queue is empty");
			else
				System.out.println(q);
	}
	System.out.println("Want to continue : y/n");
	cont = sc.next();
	}while(cont.equalsIgnoreCase("y"));
	}
}
