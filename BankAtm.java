package session6;
public class BankAtm extends Exception {
	String s1; 
	int atmId;
	String bankName, location;
	double balance = 10000,deposit;
	BankAtm(String s){
		s1=s;
	}
	// method to return string in case exception occurs
	  public String toString (){
		return ("BankAtam exception WE ARE SORRY "+s1);
		
	}

	// defining wihdraw method
	public void withdraw(double amt) {
		// TRY and CATCH to deal with exception
		try {
			// logic condition if amount entered is greater than balance
			if (amt > balance)
				throw new BankAtm ("BANK ATM Exception" +s1);

			// deduction of balance
			balance = balance - amt;
			System.out.println("available balance " + balance);
		}
		// catching excepton
		catch (BankAtm ex) {
			System.out.println(ex);
		}
	}

	// deposit method
	public void deposit(double amt) {
		 deposit=deposit-amt;

	}

	public static void main(String[] args) {
		// object of bankAtam class
		BankAtm obj = new BankAtm(" insufficient balance " );
		obj.withdraw(1001);  //Sufficicent amount to withdraw
		obj.withdraw(10000);// inSufficicent amount to withdraw
		obj.withdraw(789);  //Sufficicent amount to withdraw
	}

}

-------------
Sample OUTPUT:
sh-4.3$ javac BankAtm.java                                                      
sh-4.3$ java BankAtm                                                            
available balance 8999.0                                                        
BankAtam exception WE ARE SORRY BANK ATM Exception insufficient balance         
available balance 8210.0

