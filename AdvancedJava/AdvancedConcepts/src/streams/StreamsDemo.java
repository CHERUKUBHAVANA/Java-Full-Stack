package streams;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
public class StreamsDemo {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(4);
		nums.add(5);
		nums.add(7);
		nums.add(3);
		nums.add(2);
		nums.add(6);
		
//		Consumer<Integer> con = new Consumer<>() { 
//			public void accept(Integer n) {
//				System.out.println(n);
//			}
//		};
		Consumer<Integer> con = n -> System.out.println(n);
		nums.forEach(con);
		
		Stream<Integer> s1 = nums.stream();
		
		Stream<Integer> s2 = s1.filter(n -> n%2==0);
//		s2.forEach(num -> System.out.print(num+" "));
		
		Stream<Integer> s3 = s2.map(n -> n*2);
//		s3.forEach(num -> System.out.print(num+" "));
		
		int result = s3.reduce(0, (c, e)->c+e);
		System.out.println(result);
		
		//How filter works. -> Filter takes Predicate object.
//		Predicate<Integer> p = new Predicate<Integer>() {
//
//			@Override
//			public boolean test(Integer t) {
//				return t%2==0;
//			}
//			
//		};
//		Predicate<Integer> p = n -> n%2==0;
		
//		Function<Integer, Integer> fun = new Function<Integer, Integer>() {
//
//			@Override
//			public Integer apply(Integer n) {
//				return n*2;
//			}
//			
//		};
//		Function<Integer, Integer> fun = n -> n*2;
		
		int res = nums.stream()
		.filter(n->n%2==0)
		.map(n -> n*2)
		.reduce(0, (c,e)->c+e);
		System.out.println(res);
		
		Stream<Integer> sortedValues = nums.stream()
				.filter(n -> n%2==0)
				.sorted();
		sortedValues.forEach(n -> System.out.print(n+" "));
	}
}
