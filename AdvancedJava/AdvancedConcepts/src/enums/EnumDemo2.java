package enums;

enum Laptop{
	Macbook(2000), XPS(2200), Surface, ThinkPad(3000);
	int price;
	private Laptop() {
		price = 500;
	}
	private Laptop(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
public class EnumDemo2 {

	public static void main(String[] args) {
//		Laptop l = Laptop.Macbook;
//		System.out.println(l + " -> " +l.getPrice());
		for(Laptop l : Laptop.values()) {
			System.out.println(l+" -> "+l.getPrice());
		}
	}

}
