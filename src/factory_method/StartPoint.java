package factory_method;

public class StartPoint {

	
	public static void main(String[] args) {
		
		
		String cardNumber = "12345666";
		
		BankFactory factory = new BankFactory();
		
	    IBank bank = factory.getBank(cardNumber);
	    
	    System.out.println(bank == null? "Invalid Bank Id" : bank.withdraw());
	    
	}
	

}
