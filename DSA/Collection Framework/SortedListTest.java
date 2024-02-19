package CollectionPrograms;

public class SortedListTest {
	public static void main(String[] args) {
		SortedList<Integer,String> sl = new SortedList<>();
		System.out.println("Empty : "+sl.isEmpty());
		System.out.println("Size : "+sl.size());
		sl.insert(1271, "Sreshta");
		sl.insert(1231,"Priya");
		sl.insert(1284, "Nandini");
		sl.insert(1269,"Bhavana");
		sl.insert(1266, "Anvitha");
		System.out.println("Empty : "+sl.isEmpty());
		System.out.println("Size : "+sl.size());
		sl.insert(1271, "Deekshitha");
		sl.insert(1201, "Aastha");
		sl.insert(1207, "Chandana");
		sl.search(1269);
		sl.insert(1290, "Princy");
		System.out.println("Empty : "+sl.isEmpty());
		System.out.println("Size : "+sl.size());
		System.out.println("Entries are : \n"+sl.display());
		sl.remove(1284);
		sl.remove(1266);
		System.out.println("Empty : "+sl.isEmpty());
		System.out.println("Size : "+sl.size());
		sl.search(1284);
		sl.remove(1290);
		System.out.println("Entries are : \n"+sl.display());
		System.out.println("Empty : "+sl.isEmpty());
		System.out.println("Size : "+sl.size());
	}
}