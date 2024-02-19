package CollectionPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class IteratorsDemo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(10);
		al.add(50);
		al.add(36);
		System.out.println("For ArrayList using Iterator : ");
		Iterator<Integer> it = al.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("For ArrayList using ListIterator: ");
		ListIterator<Integer> itr = al.listIterator();
		while(itr.hasNext()) {
			int ele = itr.next();
			if(ele == 50)
				itr.remove();
			else
				System.out.println(ele+" ");
		}
		
		System.out.println("Reversed order : ");
		while(itr.hasPrevious())
			System.out.println(itr.previous());
		
		System.out.println("For Linked lists : ");
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(12);
		ll.add(10);
		ll.add(50);
		ll.add(36);
		
		System.out.println("For Linked lists using Iterators: ");
		Iterator<Integer> itl = ll.iterator();
		while(itl.hasNext())
			System.out.println(itl.next());
		
		System.out.println("For Linked lists using ListIterators : ");
		ListIterator<Integer> ltr = ll.listIterator();
		while(ltr.hasNext()) {
			if(ltr.next() == 50)
				ltr.set(100);
		}
		ltr = ll.listIterator();
		while(ltr.hasNext()) 
			System.out.println(ltr.next());
		
		System.out.println("Reversed order : ");
		while(ltr.hasPrevious())
			System.out.println(ltr.previous());
	}
}
