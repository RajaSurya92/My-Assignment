package week1.day2;

public class Bank { 
	
	int TotalAmount = 15000;
	 float Rate_Of_Intreste = 6.3f;
	 public void deposit() { 
		 System.out.println("the deposite amount");
	 } 
	 private void Withdraw() { 
		 System.out.println("Withdraw Amount");
		
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Bank object = new Bank();
		object.deposit();
		object.Withdraw();
	

	}

}
