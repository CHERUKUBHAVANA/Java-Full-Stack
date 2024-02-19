package CollectionPrograms;

public class MyComparator implements java.util.Comparator<Person> {
	public int compare(Person p1,Person p2) {
		if(p1.income>p2.income || p1.age>p2.age)
			return 1;
		else if(p1.income<p2.income || p1.age<p2.age)
			return -1;
		else
			return 0;
	}
}
