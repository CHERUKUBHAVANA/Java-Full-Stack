package CollectionPrograms;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PersonTest {
	public static void main(String[] args) {
		MyComparator mc = new MyComparator();
		Set<Person> setA = new TreeSet<>(mc);
		Set<Person> setB = new TreeSet<>(mc);
		Set<Person> setC = new TreeSet<>(mc);
		
		float income;
		int age;
		String name,addMore;
		
		System.out.println("Enter person details : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter income : ");
			income = sc.nextFloat();
			System.out.println("Enter age : ");
			age = sc.nextInt();
			System.out.println("Enter name : ");
			name = sc.next();
			
			System.out.println("Add more persons? y/n : ");
			addMore = sc.next();
			
			setA.add(new Person(income,age,name));
		}while(addMore.equalsIgnoreCase("y"));
		
		Iterator<Person> it = setA.iterator();
		System.out.println("SET-A persons : ");
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p);
			if(p.age>60)
				setB.add(p);
			if(p.income<10000)
				setC.add(p);
		}
		
		System.out.println("SET-B persons :");
		it = setB.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("SET-C persons : ");
		it = setC.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("Common persons from SET-B and SET-C");
		setB.retainAll(setC);
		it = setB.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}