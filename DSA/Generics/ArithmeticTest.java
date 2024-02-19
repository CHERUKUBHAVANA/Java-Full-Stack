package GenericsPrograms;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticTest {
	public static void main(String[] args) {
		ArithmeticOperation<Integer> ao = new ArithmeticOperation<>(12,8);
		System.out.println("\nAddition : "+ao.add());
		System.out.println("\nSubtraction : "+ao.subtract());
		System.out.println("\nModulo : "+ao.modulo());
		List<Integer> l = new ArrayList<>();
		l.add(12);
		l.add(8);
		l.add(4);
		System.out.println(ao.addElementsOfList(l));
	}
}
