package CollectionPrograms;

public class Person {
	float income;
	int age;
	String name;
	
	public Person() {
		
	}
	public Person(float income,int age,String name) {
		this.income = income;
		this.age = age;
		this.name = name;
	}
	public String toString() {
		return "\nincome : "+income+"\nage : "+age+"\nname : "+name;
	}
}
