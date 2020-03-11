package tech;

public class bank {
	
	static int myAccountBalance;
	
	public static void main(String[] args) {
		myAccountBalance = 50;
		
		if(myAccountBalance>100 & myAccountBalance<1000) {
			System.out.println("you don't have enough money");
		}
	
			else if (myAccountBalance<100) {
				System.out.println("your homeless");
				
			}
			else {
				System.out.println("you have enough money");
			
		
		}
		
	}

}
