package GenericsPrograms;

import java.util.List;

public class ArithmeticOperation<T extends Number> {
	T num1;
	T num2;
	
	public ArithmeticOperation() {
		
	}
	public ArithmeticOperation(T num1,T num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public double add() {
		return this.num1.doubleValue() + this.num2.doubleValue();
	}
	
	public double subtract() {
		return this.num1.doubleValue() - this.num2.doubleValue();
	}
	
	public int modulo() {
		return this.num1.intValue() % this.num2.intValue();
	}
	
	public double addElementsOfList(List<? extends Number> l) {
		double sum = 0.0;
		for(Number i : l)
			sum += i.doubleValue();
		return sum;
	}
}

