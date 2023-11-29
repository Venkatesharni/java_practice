package accessmodifiers;
/**
 * This program demonstrates Private access modifiers 
 */


public class PrivateAccessmodifiers {
public static void main(String[] args) {

		
		BankAccount account = new BankAccount();// create an account object

                // public methods
		account.showName();
		account.showBalance();
	}

}
class BankAccount {

	// data members
	private long accNo = 349583348;
	private double accBalance = 45454.454d;
	private String fullName = "Venkatesh Arnipalli";
	private String email = "Venkivirat18@gmail.com";

	// methods
	private String showEmail() {
		return this.email;
	}

	public void showBalance() {
		System.out.println("The Account : " + this.accNo + " has balance : $"+this.accBalance);
	}

	public void showName() {
		System.out.println("The Account : " + this.accNo + " blongs to : "+this.fullName);
	}

	public BankAccount() { } // Private Constructor based class can not be instantiated.



}

