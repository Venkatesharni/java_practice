package accessmodifiers;
/**
 * This program demonstrates Default access modifiers 
 */


public class DefaultModifier {

	public static void main(String[] args) {
		// create an object
				FarmHouse farmHouse = new FarmHouse();

				System.out.println("Title : " + farmHouse.title);
				System.out.println();
				farmHouse.showDetails();
				farmHouse.showPrice();

	}

}
class FarmHouse {

	String title = "Royal Villa 100";
	int chairCount = 100;
	byte games = 10;
	float price = 4854.45f;

	void showDetails() {
		System.out.println(this.title + " has chair count : "+this.chairCount + " and per day price is : $"+this.price );
	}

	void showPrice() {
		System.out.println(this.title + " per day price is : $"+this.price );
	}

	FarmHouse() {} // default constructor : A constructor without any arguments or with the default value for every argument

}

